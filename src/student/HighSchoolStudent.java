package student;

import java.util.Scanner;

public class HighSchoolStudent extends Student {
	
	public HighSchoolStudent(StudentKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		
		System.out.print("Student Id: ");
		int id  = input.nextInt();
		this.setId(id);
		
		System.out.print("student Name: ");
		String name = input.next();
		this.setName(name);
		
		char answer = 'X';
		while ( answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
		{
			System.out.print("Do you habe an email address? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.print("Email address: ");
				String email = input.next();
				this.setEmail(email);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setEmail("");
				break;
			}
			else {
				
			}
		}
		System.out.print("Phone number: ");
		String phone = input.next();
		this.setPhone(phone);
		
	}
	
}
