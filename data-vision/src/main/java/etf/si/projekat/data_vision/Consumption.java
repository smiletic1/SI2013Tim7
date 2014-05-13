package etf.si.projekat.data_vision;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Choice;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JSpinner;   

public class Consumption extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Consumption frame = new Consumption();
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
	public Consumption() {
		setTitle("Consumption");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 354, 235);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTimeIntervalFrom = new JLabel("Time interval to:");
		lblTimeIntervalFrom.setBounds(30, 48, 95, 14);
		contentPane.add(lblTimeIntervalFrom);
		
		JLabel lblDevice = new JLabel("Device:");
		lblDevice.setBounds(72, 73, 53, 14);
		contentPane.add(lblDevice);
		
		JLabel lblPower = new JLabel("Power:");
		lblPower.setBounds(72, 98, 53, 14);
		contentPane.add(lblPower);
		
		textField = new JTextField();
		textField.setBounds(135, 95, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		Button button = new Button("Cancel");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		
		});
		button.setBounds(255, 168, 70, 22);
		contentPane.add(button);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setBounds(160, 168, 89, 23);
		contentPane.add(btnCalculate);
		
		textField_1 = new JTextField();
		textField_1.setBounds(135, 70, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblTimeInterfvalFrom = new JLabel("Time interval from:");
		lblTimeInterfvalFrom.setBounds(20, 25, 112, 14);
		contentPane.add(lblTimeInterfvalFrom);
		
		textField_2 = new JTextField();
		textField_2.setBounds(135, 22, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(134, 47, 87, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		btnCalculate.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Nije implementirano.", "InfoBox", JOptionPane.INFORMATION_MESSAGE);
			}
			
		});
	}
}

