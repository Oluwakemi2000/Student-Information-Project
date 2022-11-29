package assignment7;

//Author: Oluwakemi Temitope Olayinka
//October 23, 2021

public class Room {

	private String roomName; // Declaring variable room name
	private String roomLocation;// Declaring variable room location
	private int roomCapacity;// Declaring variable room capacity
	private boolean zoomComputer;// Declaring variable zoom computer

	//Introducing the set method to set values for properties and get method to retrieve information
	public void setRoomCapacity(int roomCapacity) { // Setter for room capacity
		this.roomCapacity = roomCapacity; // Adding a this function to the method
	}

	public int getRoomCapacity() { // Getter for room capacity
		return roomCapacity; // Adding a return value for room capacity
	}

	public void setRoomLocation(String roomLocation) { // Setter for room location
		this.roomLocation = roomLocation; // Adding a this function to the method
	}

	public String getRoomLocation() { // Getter for room location
		return roomLocation; // Adding a return value for room location
	}

	public void setRoomName(String roomName) { // Setter for room name
		this.roomName = roomName; // Adding a this function to the method
	}

	public String getRoomName() { // Getter for room name
		return roomName; // Adding a return value for room name
	}

	public void setZoomComputer(boolean zoomComputer) { // Setter for zoom computer
		this.zoomComputer = zoomComputer; // Adding a this function to the method
	}

	public boolean isZoomComputer() { // Getter for zoom computer
		return zoomComputer; // Adding a return value for zoom / computer
	}

}
