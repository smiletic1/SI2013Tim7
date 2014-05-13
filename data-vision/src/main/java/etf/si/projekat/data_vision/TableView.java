package etf.si.projekat.data_vision;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import etf.si.projekat.data_vision.AddSensorsTableView;

public class TableView extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableView frame = new TableView();
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
	public TableView() {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		table = new JTable();
		Object[][] data = new Object[14][3];
        data[0][0] = "0";
        data[0][1] = "0";
        data[0][2] = "0";
        table.setModel(new CustModel(data));
		table.setBounds(49, 36, 240, 144);
		contentPane.add(table);
		
		JButton btnAddNewSensor = new JButton("Add new sensor");
		btnAddNewSensor.setBounds(313, 52, 121, 23);
		contentPane.add(btnAddNewSensor);
		btnAddNewSensor.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) {
				AddSensorsTableView a=new AddSensorsTableView();
				a.setVisible(true);
			}
			
		});
		
		JButton btnRefresh = new JButton("Refresh");
		btnRefresh.setBounds(313, 83, 121, 23);
		contentPane.add(btnRefresh);
		btnRefresh.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) {
				Object[][] data = new Object[14][3];
		        data[0][0] =  "1";
		        data[0][1] =  "Temperatura";
		        data[0][2] =  "21";
		        table.setModel(new CustModel(data));
		        JOptionPane.showMessageDialog(null, "Tabela je refresh-ovana!", "InfoBox", JOptionPane.INFORMATION_MESSAGE);
			}
			
		});
		
		JButton btnExit = new JButton("Cancel");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnExit.setBounds(313, 117, 121, 23);
		contentPane.add(btnExit);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 11, 296, 240);
		contentPane.add(scrollPane);
        getContentPane().add(scrollPane);
	}
	class CustModel extends AbstractTableModel {
        private String[] columnNames = {"Sensor Id", "Sensor Name","Sensor Value"};
        private Object[][] data = null;

        public CustModel(Object[][] data) {
            this.data = data;
        }
        public int getColumnCount() {
            return columnNames.length;
        }

        public int getRowCount() {
            return data.length;
        }

        public String getColumnName(int col) {
            return columnNames[col];
        }

        public Object getValueAt(int row, int col) {
            return data[row][col];
        }

        public Class getColumnClass(int col) {
            return getValueAt(0, col).getClass();
        }
    }
}
