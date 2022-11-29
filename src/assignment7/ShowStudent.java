package assignment7;

//Author: Oluwakemi Temitope Olayinka
//October 23, 2021

import java.io.FileWriter; // Importing file writer
import java.io.IOException; // Importing input output exception

public class ShowStudent {

	public static void main(String[] args) {
		Student student = new Student();// Instantiating a student object
		student.setStudentID(3333);// Setting the student ID for the student object
		student.setNumberOfPointEarned(14);// Setting the points earned for the student object
		student.setNumberOfCreditHourEarned(4);// setting credit hours earned for the student object
		student.calculateGPA();// Calculating GPA for the student object
		student.showStudentDetails();// Print student object information

		Student student2 = new Student(); // Instantiating a new student object
		student2.showStudentDetails(); // Print student 2 information

		// Constructing the necessary output
		String output = "============================\n";
		output = output + "Student Id:	" + student.getStudentID() + "\n"; // constructing the necessary output for
																			// student id
		output = output + "Points Earned:	" + student.getNumberOfPointEarned() + "\n"; // constructing the necessary
																							// output for point earned
		output = output + "Credit Hours:	" + student.getNumberOfCreditHourEarned() + "\n"; // constructing the
																								// necessary output for
																								// credit hours
		output = output + "CGPA:	" + student.getGradePointAverage() + "\n"; // constructing the necessary output for
																				// CGPA
		output = output + "=============================" + "\n"; // constructing a space using the next line option
		output = output + "Student Id:	" + student2.getStudentID() + "\n"; // constructing the necessary output for
																			// student 2
		output = output + "Points Earned:	" + student2.getNumberOfPointEarned() + "\n"; // constructing the necessary
																							// output for point earned
		output = output + "Credit Hours:	" + student2.getNumberOfCreditHourEarned() + "\n"; // constructing the
																								// necessary output for
																								// credit hours
		output = output + "CGPA:	" + student2.getGradePointAverage() + "\n"; // constructing the necessary output for
																				// CGPA

		// Using the try and catch method
		try {
			FileWriter fileWriter = new FileWriter("studentInfo.txt");// Introducing new file writer
			fileWriter.write(output);// Write output using file writer
			fileWriter.close(); // Close a file writer
		} catch (Exception e) { // Catch Input output exception

		}

	}

}
