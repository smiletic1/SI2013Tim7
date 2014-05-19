package etf.si.projekat.data_vision;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Choice;
import java.awt.Button;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;




import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction; 
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



import etf.si.projekat.util.HibernateUtil;
import ba.unsa.etf.si.beans.DeviceName;
import ba.unsa.etf.si.beans.DeviceType;



public class Add1Sensor extends JFrame {

	private JPanel contentPane;


	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add1Sensor frame = new Add1Sensor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Add1Sensor() {
		setBounds(100, 100, 298, 160);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSensorType = new JLabel("Sensor type:");
		lblSensorType.setBounds(55, 35, 79, 14);
		contentPane.add(lblSensorType);
		
		JButton btnProcess = new JButton("Process");
		btnProcess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//prikaz grafa
				BarPlotShow bp=new BarPlotShow();
				//OneGraphShow og=new OneGraphShow();
			//	og.setVisible(true);
				
				
			
			}
		});
		btnProcess.setBounds(152, 88, 89, 23);
		contentPane.add(btnProcess);
		
		JButton btnExit = new JButton("Cancel");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				
			}
		});
		btnExit.setBounds(45, 88, 89, 23);
		contentPane.add(btnExit);
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel());
		comboBox.setBounds(134, 32, 105, 20);
		contentPane.add(comboBox);
			
		    Session session = HibernateUtil.getSessionFactory().openSession();
		    Transaction t=null;
			try{
				t = session.beginTransaction(); 
			    List list = session.createQuery("from DeviceType").list();
			   
			     for (Iterator iterator = list.iterator(); iterator.hasNext();){  
			        DeviceType dt =(DeviceType) iterator.next();
			        comboBox.addItem(dt.getType());
			        
			      }
			      t.commit();
		}
			catch(Exception e)
		{
			System.out.println("Error:"+e);
		}
			finally{
				session.close();
			}
}
}		
	    
	

