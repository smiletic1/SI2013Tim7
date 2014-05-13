package etf.si.projekat.data_vision;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WelcomeScreen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeScreen frame = new WelcomeScreen();
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
	public WelcomeScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 276, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("ONE GRAPH");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				OneGraph a = new OneGraph();
				a.setVisible(true);
			}
			
			
		});
		btnNewButton.setBounds(28, 36, 197, 23);
		contentPane.add(btnNewButton);
		
		JButton btnTwoGraphs = new JButton("TWO GRAPHS");
		btnTwoGraphs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TwoGraphs a = new TwoGraphs();
				a.setVisible(true);
			}
		});
		btnTwoGraphs.setBounds(28, 68, 197, 23);
		contentPane.add(btnTwoGraphs);
		
		JButton btnThreeGraphs = new JButton("THREE GRAPHS");
		btnThreeGraphs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ThreeGraphs a = new ThreeGraphs();
				a.setVisible(true);
			}
		});
		btnThreeGraphs.setBounds(28, 102, 197, 23);
		contentPane.add(btnThreeGraphs);
		
		JButton btnTableView = new JButton("TABLE VIEW");
		btnTableView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TableView a = new TableView();
				a.setVisible(true);
			}
		});
		btnTableView.setBounds(28, 136, 197, 23);
		contentPane.add(btnTableView);
		
		JButton btnConsumption = new JButton("CONSUMPTION");
		btnConsumption.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Consumption a = new Consumption();
				a.setVisible(true);
			}
		});
		btnConsumption.setBounds(28, 170, 197, 23);
		contentPane.add(btnConsumption);
	}
}
