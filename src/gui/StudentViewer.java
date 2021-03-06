package gui;

import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SpringLayout;
import javax.swing.table.DefaultTableModel;



import event.StudentViewerCancelListener;
import manager.StudentManager;
import student.StudentInput;

public class StudentViewer extends JPanel {
	
	WindowFrame frame;
	
	StudentManager studentManager;

	
	
	
	public StudentManager getStudentManager() {
		return studentManager;
	}

	public void setStudentManager(StudentManager studentManager) {
		this.studentManager = studentManager;
		this.removeAll();
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Id");
		model.addColumn("Name");
		model.addColumn("Weight");
		model.addColumn("Hour");
		model.addColumn("Kcalory");
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JButton cancelButton = new JButton("cancel");
		
		cancelButton.addActionListener(new StudentViewerCancelListener(frame));
		
		panel.add(cancelButton);
		
		SpringUtilities.makeCompactGrid(panel, 1, 1, 1, 1, 1, 1);
		
		this.add(panel);
		this.setVisible(true);

		for (int i=0; i< studentManager.size(); i++) {
			Vector row = new Vector();
			StudentInput si = studentManager.get(i);
			
			row.add(si.getId());
			row.add(si.getName());
			row.add(si.getWeight());
			row.add(si.getHour());
			row.add(si.getKcalory());
			model.addRow(row);
			

		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
		
	}

	public StudentViewer(WindowFrame frame, StudentManager studentManager) {
		
		this.frame = frame;
		this.studentManager = studentManager;
		
		System.out.println("***" + studentManager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Id");
		model.addColumn("Name");
		model.addColumn("Weight");
		model.addColumn("Hour");
		model.addColumn("Kcalory");

		for (int i=0; i< studentManager.size(); i++) {
			Vector row = new Vector();
			StudentInput si = studentManager.get(i);
			
			row.add(si.getId());
			row.add(si.getName());
			row.add(si.getWeight());
			row.add(si.getHour());
			row.add(si.getKcalory());
			model.addRow(row);

		}
		
	}

}
