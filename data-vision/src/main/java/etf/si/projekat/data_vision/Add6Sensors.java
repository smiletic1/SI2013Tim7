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

public class Add6Sensors extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add6Sensors frame = new Add6Sensors();
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
	public Add6Sensors() {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSensorType = new JLabel("Sensor type 1");
		lblSensorType.setBounds(26, 47, 93, 14);
		contentPane.add(lblSensorType);
		
		JLabel lblSensorType_1 = new JLabel("Sensor type 2");
		lblSensorType_1.setBounds(26, 71, 93, 14);
		contentPane.add(lblSensorType_1);
		
		JLabel lblSensorType_2 = new JLabel("Sensor type 3");
		lblSensorType_2.setBounds(26, 96, 93, 14);
		contentPane.add(lblSensorType_2);
		
		JLabel lblSensorType_3 = new JLabel("Sensor type 4");
		lblSensorType_3.setBounds(26, 121, 93, 14);
		contentPane.add(lblSensorType_3);
		
		JLabel lblSensorType_4 = new JLabel("Sensor type 5");
		lblSensorType_4.setBounds(26, 144, 93, 14);
		contentPane.add(lblSensorType_4);
		
		JLabel lblSensorType_5 = new JLabel("Sensor type 6");
		lblSensorType_5.setBounds(26, 169, 93, 14);
		contentPane.add(lblSensorType_5);
		
		Choice choice = new Choice();
		choice.setBounds(113, 41, 120, 20);
		contentPane.add(choice);
		
		Choice choice_1 = new Choice();
		choice_1.setBounds(113, 67, 120, 20);
		contentPane.add(choice_1);
		
		Choice choice_2 = new Choice();
		choice_2.setBounds(113, 90, 120, 20);
		contentPane.add(choice_2);
		
		Choice choice_3 = new Choice();
		choice_3.setBounds(113, 115, 120, 20);
		contentPane.add(choice_3);
		
		Choice choice_4 = new Choice();
		choice_4.setBounds(113, 138, 120, 20);
		contentPane.add(choice_4);
		
		Choice choice_5 = new Choice();
		choice_5.setBounds(113, 163, 120, 20);
		contentPane.add(choice_5);
		
		JButton btnProcess = new JButton("Process");
		btnProcess.setBounds(242, 216, 89, 23);
		contentPane.add(btnProcess);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancel.setBounds(144, 216, 89, 23);
		contentPane.add(btnCancel);
	}

}