package etf.si.projekat.data_vision;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Choice;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Add2Sensors extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add2Sensors frame = new Add2Sensors();
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
	public Add2Sensors() {
		setBounds(100, 100, 305, 170);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSensorType = new JLabel("Sensor type 1");
		lblSensorType.setBounds(10, 27, 75, 14);
		contentPane.add(lblSensorType);
		
		JLabel lblSensorType_1 = new JLabel("Sensor type 2");
		lblSensorType_1.setBounds(10, 52, 75, 14);
		contentPane.add(lblSensorType_1);
		
		Choice choice = new Choice();
		choice.setBounds(91, 21, 115, 20);
		contentPane.add(choice);
		
		Choice choice_1 = new Choice();
		choice_1.setBounds(91, 46, 115, 20);
		contentPane.add(choice_1);
		
		JButton btnProcess = new JButton("Process");
		btnProcess.setBounds(190, 98, 89, 23);
		contentPane.add(btnProcess);
		
		JButton btnExit = new JButton("Cancel");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnExit.setBounds(91, 98, 89, 23);
		contentPane.add(btnExit);
	}

}
