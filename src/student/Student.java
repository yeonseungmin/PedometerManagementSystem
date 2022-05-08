package student;

import java.util.Scanner;

public abstract class Student {

		protected StudentKind kind = StudentKind.University;
		protected String name;
		protected int id;
		protected String email;
		protected String phone;

		
		public Student() {

		}
		public Student(StudentKind kind) {
			this.kind = kind;
		}
		
		public Student(String name, int id) {
			this.name = name;
			this.id = id;

		}

		public Student(String name , int id , String email , String phone) {

			this.name = name;
			this.id = id;
			this.email = email;
			this.phone = phone;
		}
		
		public Student(StudentKind kind , String name , int id , String email , String phone) {
			this.kind = kind;
			this.name = name;
			this.id = id;
			this.email = email;
			this.phone = phone;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public abstract void printInfo();

}