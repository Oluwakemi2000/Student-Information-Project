package assignment7;

//Author: Oluwakemi Temitope Olayinka
//October 23, 2021
import java.io.*;// importing java input and output

public class showCourse {

	public static void main(String[] args) {

		String fileName = "courseInfo.txt"; // Declaring variable file name
		Course course = new Course(); // Creating an instance for course
		Room room = new Room(); // Creating an instance for room

		// Using the try and catch method
		FileReader fr; // Declaring file reader
		try {
			fr = new FileReader(fileName); // initializing file reader for file name
			BufferedReader inRead = new BufferedReader(fr);// Assign a buffer reader to read the file
			String str;// Declaring a string to hold each line in the file
			int line = 1; // Declaring and initializing the line number

			while ((str = inRead.readLine()) != null) { // Read each line in the file
				System.out.println(str);// Print each line in the file in string

				// Introducing the Switch statement that will handle each line in the file

				switch (line) {
				// populated course information
				case 2:
					course.setCourseName(str); // Introducing case 2 for course name
					break;
				case 3:
					course.setDescription(str); // Introducing case 3 for description
					break;
				case 4:
					course.setDepartment(str); // Introducing case 4 for department
					break; // Adding a break option
				case 5:
					room.setRoomName(str); // Introducing case 5 for Room name
					course.setRoom(room);
					break; // Adding a break option
				case 6:
					course.setSemester(str); // Introducing case 6 for semester
					break; // Adding a break option
				case 7:
					course.setCreditHours(Double.parseDouble(str)); // Introducing case 7 for credit hours
					break; // Adding a break option

				// begin populating the room information

				case 9:
					room.setRoomName(str); // Introducing case 9 for room name
					break; // Adding a break option
				case 10:
					room.setRoomLocation(str); // Introducing case 10 for room location
					break; // Adding a break option
				case 11:
					room.setRoomCapacity(Integer.parseInt(str)); // Introducing case 11 for room capacity
					break;// Adding a break option
				case 12:
					room.setZoomComputer(true); // Introducing case 12 for zoom / computer
					break;
				default: // Adding default for invalid selection
					break;// Adding a break option
				}
				line++; // Increase the line number in each iteration
			}

			// Printing out necessary information

			System.out.println("Name of course: 	" + course.getCourseName()); // printing necessary information for
																					// name of course
			System.out.println("Department Name: 	" + course.getDepartment()); // printing necessary information for
																					// department name
			System.out.println("Course Description: 	" + course.getDescription());// printing necessary information
																						// for course description
			System.out.println("Credit Hours: 		" + course.getCreditHours()); // printing necessary information for
																					// credit hours
			System.out.println("Class Room: 		" + course.getRoom().getRoomName()); // printing necessary
																							// information for class
																							// room
			System.out.println("\n\n");
			System.out.println(room.getRoomName() + " Information \n"); // printing necessary information for room name

			System.out.println("Location of " + room.getRoomName() + ":	" + room.getRoomLocation()); // printing
																										// necessary
																										// information
																										// for location
			System.out.println("Capacity of " + room.getRoomName() + ":	" + room.getRoomCapacity()); // printing
																										// necessary
																										// information
																										// for Capacity
			System.out.println("Zoom and Computers " + ":	" + room.isZoomComputer());// printing necessary information
																						// for Zoom and Computers

		

		} catch (Exception e) { // catch exception for Input Output Exception

		}

	}

}
