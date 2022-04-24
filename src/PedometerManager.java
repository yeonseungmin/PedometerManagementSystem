import java.util.Scanner;

public class PedometerManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StudentManager studentManager = new StudentManager(input);
		
		
		int num = -1;
		while (num !=5) {
			System.out.println("*** Pedometer Management System Menu ***");
			System.out.println("1. Add Pedometer");
			System.out.println("2. Delete Pedometer");
			System.out.println("3. Edit Pedometer");
			System.out.println("4. View Pedometers");
			System.out.println("5. Exit");
			System.out.println("Select one number between 1-6: ");
			num = input.nextInt();
			if (num == 1) {
				studentManager.addStudent();
			}
			else if (num == 2) {
				studentManager.deletestudent();
			}
			else if (num == 3) {
				studentManager.editstudent();
			}
			else if (num == 4) {
				studentManager.viewStudents();			
			}
			else {
				continue;
			}
		}
	}


}
