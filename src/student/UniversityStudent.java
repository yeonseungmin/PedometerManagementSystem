package student;

import java.util.Scanner;

public class UniversityStudent extends Student {

	
	public UniversityStudent(StudentKind kind) {
		super();
	}
	
	public void getUserInput(Scanner input) {
		setStudentID( input);
		setStudentName( input);
		setStudentWeight( input);
		setPedometerHour( input);
	}
	
	public void printInfo() {
		String skind = getKindString();
		kcalory = hour*4*weight;
		System.out.println("kind:" + skind + " name: " + name + " id: " + id + " weight: " + weight + " hour: " + hour + " kcalory: " + kcalory);
	}


}
