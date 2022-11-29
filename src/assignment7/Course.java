package assignment7;

//Author: Oluwakemi Temitope Olayinka
//October 23, 2021

public class Course {

	private String courseName;// Declaring variable course name
	private String description;// Declaring variable description
	private String department;// Declaring variable department
	private String semester;// Declaring variable semester
	private double creditHours;// Declaring credit hours
	private Room room;// Declaring variable room

	//Introducing the set method to set values for properties and get method to retrieve information
	public void setCourseName(String courseName) { // Setter for course name
		this.courseName = courseName; // Adding a this function to the method
	}

	public String getCourseName() { // Getter for course name
		return courseName; // Adding a return value for course name
	}

	public void setDescription(String description) { // Setter for description
		this.description = description; // Adding a this function to the method
	}
	public String getDescription() { // Getter for description
		return description; // Adding a return value for description
	}

	public void setDepartment(String department) { // Setter for department
		this.department = department; // Adding a this function to the method
	}

	public String getDepartment() { // Getter for department
		return department; // Adding a return value for description
	}

	public void setSemester(String semester) { // Setter for semester
		this.semester = semester; // Adding a this function to the method
	}

	public String getSemester() { // Getter for semester
		return semester; // Adding a return value for semester
	}

	public void setCreditHours(double creditHours) { // Setter for credit hours
		this.creditHours = creditHours; // Adding a this function to the method
	}

	public double getCreditHours() { // Getter for credit hours
		return creditHours; // Adding a return value for credit hours
	}

	public void setRoom(Room room) { // Setter for room
		this.room = room; // Adding a this function to the method
	}

	public Room getRoom() { // Getter for room
		return room; // Adding a return value for room
	}

}
