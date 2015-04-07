  public class RoomDriver {
	
	//Main method
	public static void main(String[] args) {
		
		Room myRoom = new Room();
		myRoom.setWhichRoom("My room");
		myRoom.setColorOfWalls("red");
		myRoom.setNumberOfWindows(2);
		myRoom.setFlooringType("carpet");
		System.out.println("\n " + myRoom.toString());
		
		Room anotherRoom = new Room();
		anotherRoom.setWhichRoom("Another room");
		anotherRoom.setColorOfWalls("yellow");
		anotherRoom.setNumberOfWindows(1);
		anotherRoom.setFlooringType("hardwood");
		System.out.println("\n " + anotherRoom);
		
		Room smallerRoom = new Room();
		smallerRoom.setWhichRoom("A smaller room");
		smallerRoom.setColorOfWalls("purple");
		smallerRoom.setNumberOfWindows(0);
		smallerRoom.setFlooringType("tiled");
		System.out.println("\n" + smallerRoom);
		
		Room biggerRoom = new Room();
		biggerRoom.setWhichRoom("A bigger room");
		biggerRoom.setColorOfWalls("white");
		biggerRoom.setNumberOfWindows(3);
		biggerRoom.setFlooringType("carpet");
		System.out.println("\n" + biggerRoom);
		
		
	}

  }
