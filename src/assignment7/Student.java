package assignment7;

//Author: Oluwakemi Temitope Olayinka

//October 23, 2021

public class Student {

	private int idNumber; // Declaring variable id number
	private int numberOfCreditHourEarned; // Declaring variable credit hours
	private double numberOfPointEarned; // Declaring variable point earned
	private double gradePointAverage; // Declaring variable GPA

	public Student() { // Constructor for student class
		idNumber = 9999; // Set default value id number
		numberOfCreditHourEarned = 3; // Set default value for credit hours
		numberOfPointEarned = 12;// Set default value for point earned
		calculateGPA(); // calculate GPA
	}
 // Introducing the set method to set values for properties
	public void setStudentID(int studentID) { // Setter for student ID
		idNumber = studentID;
	}

	public void setNumberOfCreditHourEarned(int creditHourEarned) { // Setter for credit hours
		numberOfCreditHourEarned = creditHourEarned;
	}

	public void setNumberOfPointEarned(double pointEarned) {// Setter for points earned
		numberOfPointEarned = pointEarned;
	}

	public int getStudentID() {// Getter for student ID
		return idNumber; // Adding a return value
	}

	public int getNumberOfCreditHourEarned() { // Getter for credit hours
		return numberOfCreditHourEarned; // Adding a return value
	}

	public double getNumberOfPointEarned() { // Getter for points earned
		return numberOfPointEarned;// Adding a return value
	}

	public double getGradePointAverage() { // Getter for GPA
		return gradePointAverage; // Adding a return value
	}

	public double calculateGPA() { // Calculating the GPA
		gradePointAverage = numberOfPointEarned / numberOfCreditHourEarned;
		return gradePointAverage; // Adding a return value
	}

	// Printing necessary information
	public void showStudentDetails() {
		System.out.println("================================================="); // Adding a demarcation to the printing
																					// process
		System.out.println("Student ID:	" + idNumber); // printing necessary information for student id
		System.out.println("Point Earned:	" + numberOfPointEarned); // printing necessary information for point earned
		System.out.println("Hours Earned:	" + numberOfCreditHourEarned); // printing necessary information for hours
																			// earned
		System.out.println("CPGA:	" + String.format("%.2f", gradePointAverage)); // printing necessary information for
																					// CGPA
		System.out.println("================================================="); // Adding a demarcation to the printing
																					// process
	}
}
