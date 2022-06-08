package student;

import java.io.Serializable;
import java.util.Scanner;

//import exception.EmailFormatException;

public abstract class Student implements StudentInput, Serializable {

		/**
	 * 
	 */
	private static final long serialVersionUID = -7772788164558114352L;
		protected StudentKind kind = StudentKind.University;
		protected String name;
		protected int id;
		protected int weight;
		protected int hour;
		protected int kcalory;
		
		public Student() {

		}

		
		public Student(StudentKind kind , String name , int id , int weight , int hour, int kcalory) {
			this.kind = kind;
			this.name = name;
			this.id = id;
			this.weight = weight;
			this.hour = hour;
			this.kcalory = kcalory;
		}
		
		
	public StudentKind getKind() {
		return kind;
	}

	public void setKind(StudentKind kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getKcalory() {
		return kcalory;
	}

	public void setKcalory(int kcalory) {
		this.kcalory = hour*4*weight;
	}

	public abstract void printInfo();

	public void setStudentID(Scanner input) {
		System.out.print(" Student ID: ");
		int id = input.nextInt();
		this.setId(id );
	}
	
	public void setStudentName( Scanner input) {
		System.out.print(" Student Name: ");
		String name = input.next();
		this.setName(name );
	}
	
	public void setStudentWeight(Scanner input) {
		System.out.print(" Student Weight: ");
		int weight = input.nextInt();
		this.setWeight(weight );
	}
	
	public void setPedometerHour(Scanner input) {
		System.out.print(" Pedometer Hour: ");
		int hour = input.nextInt();
		this.setHour(hour );
	}
	
	public void setKcalory(Scanner input) {
		System.out.print(" Kcalory : ");
		int kcalory = hour*4*weight;
		this.setKcalory(kcalory );
	}
	
	public String getKindString() {
		String skind = "none";
		switch(this.kind){
		case University :
			skind = "Univ.";
			break;
		default :
		}
		return skind;
	}
}