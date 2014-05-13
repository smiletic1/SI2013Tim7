package etf.si.projekat.data_vision;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class AddSensorsTableView extends JFrame
{
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddSensorsTableView frame = new AddSensorsTableView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public AddSensorsTableView() {
		setTitle("Add sensor");
		contentPane = new JPanel();
		setBounds(100, 100, 356, 204);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUnesiteImeSenzora = new JLabel("Type sensor name:");
		lblUnesiteImeSenzora.setBounds(10, 33, 113, 22);
		contentPane.add(lblUnesiteImeSenzora);
		
		
		JLabel lblUnesiteVrijednostSenzora = new JLabel("Type sensor value:");
		lblUnesiteVrijednostSenzora.setBounds(10, 78, 99, 14);
		contentPane.add(lblUnesiteVrijednostSenzora);
		
		JButton Add = new JButton("Add sensor");
		Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Nije implementirano.Korisnik bi bio ubacen u bazu.", "InfoBox", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		Add.setBounds(189, 132, 113, 23);
		contentPane.add(Add);
		
		JButton Exit = new JButton("Cancel");
		Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				dispose();
			}
		});
		Exit.setBounds(90, 132, 89, 23);
		contentPane.add(Exit);
		
		textField = new JTextField();
		textField.setBounds(132, 34, 99, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(132, 75, 99, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
}
