package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import event.StudentAdderCancelListener;
import event.StudentAdderListener;
import manager.StudentManager;

public class StudentAdder extends JPanel {
	
	WindowFrame frame;
	
	StudentManager studentManager;
	
	public StudentAdder(WindowFrame frame, StudentManager studentManager) {
		
		this.frame = frame;
		this.studentManager = studentManager;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelID = new JLabel("ID: ", JLabel.TRAILING);
		JTextField fieldID = new JTextField(10);
		labelID.setLabelFor(fieldID);
		panel.add(labelID);
		panel.add(fieldID);
		
		JLabel labelName = new JLabel("Name: ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelWeight = new JLabel("Weight: ", JLabel.TRAILING);
		JTextField fieldWeight = new JTextField(10);
		labelWeight.setLabelFor(fieldWeight);
		panel.add(labelWeight);
		panel.add(fieldWeight);
		
		JLabel labelHour = new JLabel("Hour: ", JLabel.TRAILING);
		JTextField fieldHour = new JTextField(10);
		labelHour.setLabelFor(fieldHour);
		panel.add(labelHour);
		panel.add(fieldHour);

		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new StudentAdderListener(fieldID, fieldName, fieldWeight, fieldHour, studentManager));
		
		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new StudentAdderCancelListener(frame));
		
		panel.add(labelHour);
		panel.add(fieldHour);
		
		panel.add(saveButton);
		panel.add(cancelButton);

		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		

		this.add(panel);
		this.setVisible(true);
	}
}
