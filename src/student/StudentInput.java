package student;

import java.util.Scanner;



public interface StudentInput {
	
	public int getId();

	public void setId(int id);
	
	public String getName();
	
	public void setName(String name);
	
	public int getWeight();

	public void setWeight(int weight);
	
	public int getHour();

	public void setHour(int hour);
	
	public int getKcalory();

	public void setKcalory(int kcalory);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setStudentID(Scanner input);
	
	public void setStudentName(Scanner input);
	
	public void setStudentWeight(Scanner input);
	
	public void setPedometerHour(Scanner input);
	
}
