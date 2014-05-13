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

public class Add9Sensors extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add9Sensors frame = new Add9Sensors();
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
	public Add9Sensors() {
		setBounds(100, 100, 450, 331);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSensorType = new JLabel("Sensor type 1");
		lblSensorType.setBounds(21, 38, 73, 14);
		contentPane.add(lblSensorType);
		
		JLabel lblSensorType_1 = new JLabel("Sensor type 2");
		lblSensorType_1.setBounds(21, 64, 73, 14);
		contentPane.add(lblSensorType_1);
		
		JLabel lblSensorType_2 = new JLabel("Sensor type 3");
		lblSensorType_2.setBounds(21, 89, 73, 14);
		contentPane.add(lblSensorType_2);
		
		JLabel lblSensorType_3 = new JLabel("Sensor type 4");
		lblSensorType_3.setBounds(21, 114, 73, 14);
		contentPane.add(lblSensorType_3);
		
		JLabel lblSensorType_4 = new JLabel("Sensor type 5");
		lblSensorType_4.setBounds(21, 137, 73, 14);
		contentPane.add(lblSensorType_4);
		
		JLabel lblSensorType_5 = new JLabel("Sensor type 6");
		lblSensorType_5.setBounds(21, 162, 73, 14);
		contentPane.add(lblSensorType_5);
		
		JLabel lblSensorType_6 = new JLabel("Sensor type 7");
		lblSensorType_6.setBounds(21, 187, 73, 14);
		contentPane.add(lblSensorType_6);
		
		JLabel lblSensorType_7 = new JLabel("Sensor type 8");
		lblSensorType_7.setBounds(21, 210, 73, 14);
		contentPane.add(lblSensorType_7);
		
		JLabel lblSensorType_8 = new JLabel("Sensor type 9");
		lblSensorType_8.setBounds(21, 237, 73, 14);
		contentPane.add(lblSensorType_8);
		
		Choice choice = new Choice();
		choice.setBounds(102, 32, 130, 20);
		contentPane.add(choice);
		
		Choice choice_1 = new Choice();
		choice_1.setBounds(102, 58, 130, 20);
		contentPane.add(choice_1);
		
		Choice choice_2 = new Choice();
		choice_2.setBounds(102, 83, 130, 20);
		contentPane.add(choice_2);
		
		Choice choice_3 = new Choice();
		choice_3.setBounds(102, 108, 130, 20);
		contentPane.add(choice_3);
		
		Choice choice_4 = new Choice();
		choice_4.setBounds(102, 131, 130, 20);
		contentPane.add(choice_4);
		
		Choice choice_5 = new Choice();
		choice_5.setBounds(102, 157, 130, 20);
		contentPane.add(choice_5);
		
		Choice choice_6 = new Choice();
		choice_6.setBounds(102, 181, 130, 20);
		contentPane.add(choice_6);
		
		Choice choice_7 = new Choice();
		choice_7.setBounds(102, 207, 130, 20);
		contentPane.add(choice_7);
		
		Choice choice_8 = new Choice();
		choice_8.setBounds(102, 231, 130, 20);
		contentPane.add(choice_8);
		
		JButton btnProcess = new JButton("Process");
		btnProcess.setBounds(261, 259, 89, 23);
		contentPane.add(btnProcess);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancel.setBounds(165, 259, 89, 23);
		contentPane.add(btnCancel);
	}

}
