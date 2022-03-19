import java.util.Scanner;

public class PedometerManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int num = 5;
		
		
		while (num !=6) {
			System.out.println("*** Pedometer Management System Menu ***");
			System.out.println("1. Add Pedometer");
			System.out.println("2. Delete Pedometer");
			System.out.println("3. Edit Pedometer");
			System.out.println("4. View Pedometer");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			System.out.println("Select one number between 1-6: ");
			num = input.nextInt();
			if (num == 1) {
				addpedometer();
			}
			else if (num == 2) {
				deletepedometer();
			}
			else if (num == 3) {
				editpedometer();
			}
			else if (num == 4) {
				viewpedometer();			
			}
			else {
				continue;
			}
		}
	}

	private static void addpedometer() {
		Scanner input = new Scanner(System.in);
		System.out.print("Student Id");
		int studentId = input.nextInt();
		System.out.print("student Name:");
		String studentName = input.next();
		System.out.print("Email address:");
		String studentEmail = input.next();	
		System.out.print("Phone number:");
		String studentPhone = input.next();	
	}

	private static void deletepedometer() {
		Scanner input = new Scanner(System.in);
		System.out.print("Student Id");
		int studentId = input.nextInt();
		
	}

	private static void editpedometer() {
		Scanner input = new Scanner(System.in);
		System.out.print("Student Id");
		int studentId = input.nextInt();
	}

	private static void viewpedometer() {
		Scanner input = new Scanner(System.in);
		System.out.print("Student Id");
		int studentId = input.nextInt();
		
	}
}
