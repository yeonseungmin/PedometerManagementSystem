package manager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import student.Student;
import student.StudentInput;
import student.StudentKind;
import student.UniversityStudent;

public class StudentManager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1890483372099404288L;
	
	ArrayList<StudentInput> students = new ArrayList<StudentInput>();
	transient Scanner input;
	StudentManager(Scanner input){
		this.input = input;
	}
	
	public void setScanner(Scanner input) {
		this.input = input;
	}
	
	public void addStudent(String id, String name, String weight, String hour, String kcalory) {
		StudentInput studentInput = new UniversityStudent(StudentKind.University);
		studentInput.getUserInput(input);
		students.add(studentInput);
	}
	
	public void addStudent(StudentInput studentInput) {
		students.add(studentInput);
	}
	
	public void addStudent() {
		int kind = 0;
		StudentInput studentInput;
	}

	public void deletestudent() {
		System.out.print(" Student Id: ");
		int studentId = input.nextInt();
		int index = findIndex(studentId);
		removefromStudents(index,studentId);
		
	}
	public int findIndex(int studentId) {
		int index = -1;
		for (int i = 0; i<students.size(); i++) {
			if(students.get(i).getId() == studentId) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int removefromStudents(int index, int studentId) {
		if(index >= 0) {
			students.remove(index);
			System.out.println("the student" + studentId +"is deleted");
			return 1;
		}
		else {
			System.out.println("the student has not been registered");
			return -1;
		}
	}

	public void editstudent() {
		System.out.print(" Student Id: ");
		int studentId = input.nextInt();
		for (int i = 0; i<students.size(); i ++) {
			StudentInput student = students.get(i);
		if(student.getId() == studentId) {
			int num = -1;
			while (num != 5) { 
				showEditMenu();
			num = input.nextInt();
			switch(num) {
			case 1:
				student.setStudentID(input);
				break;
			case 2:
				student.setStudentName(input);
				break;
			case 3:
				student.setStudentWeight(input);
			case 4:
				student.setPedometerHour(input);
			default:
				continue;
			}
		}// while
		break;
	}// if
	}// for
	}

	public void viewStudents() {
		System.out.println("# of registered students: " + students.size());
		for (int i = 0; i<students.size(); i++) {
			students.get(i).printInfo();
		}
	}
	
	public int size() {
		return students.size();
	}
	
	public StudentInput get(int index) {
		return (Student) students.get(index);
	}
	
	public void showEditMenu() {
		System.out.println("** Student Info Edit Menu **");
		System.out.println("1. Edit Id ");
		System.out.println("2. Edit Name ");
		System.out.println("3. Edit Weight ");
		System.out.println("4. Edit Hour");
		System.out.println("5. Exit ");
		System.out.println("Select one number between 1-6: ");
	}
}
