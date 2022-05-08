import java.util.ArrayList;
import java.util.Scanner;

import student.ElementarySchoolStudent;
import student.HighSchoolStudent;
import student.Student;
import student.StudentInput;
import student.StudentKind;
import student.UniversityStudent;

public class StudentManager {
	ArrayList<StudentInput> students = new ArrayList<StudentInput>();
	Scanner input;
	StudentManager(Scanner input){
		this.input = input;
	}
	
	public void addStudent() {
		int kind = 0;
		StudentInput studentInput;
		while ( kind != 1 && kind != 2) {
			System.out.println("1 for University");
			System.out.println("2 for High Shcool");
			System.out.println("3 for Elementary Shcool");
			System.out.print("Select num 1, 2, or 3 for Student Kind :");
			kind  = input.nextInt();
			if (kind == 1) {
				studentInput = new UniversityStudent(StudentKind.University);
				studentInput.getUserInput(input);
				students.add(studentInput);
				break;
			}
			else if (kind == 2) {
				studentInput = new HighSchoolStudent(StudentKind.HighSchool);
				studentInput.getUserInput(input);
				students.add(studentInput);
				break;
			}
			else if (kind == 3) {
				studentInput = new ElementarySchoolStudent(StudentKind.ElementarySchool);
				studentInput.getUserInput(input);
				students.add(studentInput);
				break;
			}
			else {
				System.out.print("Select num for Student Kind between 1 and 2:");
			}
		}

	}

	public void deletestudent() {
		System.out.print(" Student Id: ");
		int studentId = input.nextInt();
		int index = -1;
		for (int i = 0; i<students.size(); i++) {
			if(students.get(i).getId() == studentId) {
				index = i;
				break;
			}
		}
		
		if(index >= 0) {
			students.remove(index);
			System.out.println("the student" + studentId +"is deleted");
		}
		else {
			System.out.println("the student has not been registered");
			return;
		}
	}

	

	public void editstudent() {
		System.out.print(" Student Id: ");
		int studentId = input.nextInt();
		for (int i = 0; i<students.size(); i ++) {
			StudentInput studentInput = students.get(i);
		if(studentInput.getId() == studentId) {
			int num = -1;
			while (num != 5) { 
			System.out.println("** Student Info Edit Menu **");
			System.out.println("1. Edit Id ");
			System.out.println("2. Edit Name ");
			System.out.println("3. Edit Email ");
			System.out.println("4. View phone ");
			System.out.println("5. Exit ");
			System.out.println("Select one number between 1-6: ");
			num = input.nextInt();
			if (num == 1) {
				System.out.print(" Student ID: ");
				int id = input.nextInt();
				studentInput.setId(id );
			}
			else if (num == 2) {
				System.out.print(" Student Name: ");
				String name = input.next();
				studentInput.setName(name );
			}
			else if (num == 3) {
				System.out.print(" Student Email: ");
				String email = input.next();
				studentInput.setEmail(email );
			}
			else if (num == 4) {
				System.out.print(" Phone number: ");
				String phone = input.next();
				studentInput.setPhone(phone );
			}
			else {
				continue;
			} // if
			}// while
			break;
			}// if
		}// for
	}

	public void viewStudents() {
//		System.out.print("Student Id: ");
//		int studentId = input.nextInt();
		System.out.println("# of registered students: " + students.size());
		for (int i = 0; i<students.size(); i++) {
			students.get(i).printInfo();
		}
		
		
	}
}
