/* Lab Exercises No.4
 
Accelerated Introduction to Computer Science Fall 2023
Course CS 201 02
Professor: Md Ali
Students: Andres Orozco, Jisun Yun, Harlee Ramos
*/

public class Student {
	private static final String singleroom = "single room";
	private static final String doubleroom = "double room";
	private static final String tripleroom = "triple room";
	private char gender;
	private String room;
	private static char default_gender = 'N';
	private static String default_room = "***";	
	
	public Student () {
		this.gender = default_gender;
		this.room = default_room;
	}

	public Student ( char newgender, String newroom) {
		if(newgender=='M'||newgender=='F'||newgender=='N') {
			this.gender=newgender;
 		} else {
 			this.gender = default_gender;
 		}
		if(newroom == null) {
			this.room = default_room;
			return;
		}
		
	    char building = newroom.charAt(0);
	    int stage = Character.getNumericValue(newroom.charAt(1));
	    int roomnumber = Character.getNumericValue(newroom.charAt(2));

	    if (building >= 'A' && building <= 'Z' && stage >= 2 && stage <= 9) {
	        if ((stage >= 2 && stage <= 4 && roomnumber >= 1 && roomnumber <= 6) ||
	                (stage >= 5 && stage <= 7 && roomnumber >= 1 && roomnumber <= 3) ||
	                (stage >= 8 && stage <= 9 && roomnumber >= 1 && roomnumber <= 2)) {
	            this.room = newroom;
	        }
	    } else {
	        this.room = default_room;
	    }

}
	// getter
	public char getgender() {
		return gender;
	}
	
	public String getroom() {
		return room;
	}
	
	// setter
	public void setgender(char newgender) {
		if(newgender=='M'||newgender=='F'||newgender=='N') {
			this.gender=newgender;
 		} else {
 			this.gender = default_gender;
 		}
	}
	
	public void setRoom(String newroom) {
	    if (newroom == null) {
	        this.room = default_room;
	        return;
	    }

	    char building = newroom.charAt(0);
	    int stage = Character.getNumericValue(newroom.charAt(1));
	    int roomnumber = Character.getNumericValue(newroom.charAt(2));

	    if (building >= 'A' && building <= 'Z' && stage >= 2 && stage <= 9) {
	        boolean Roomcheck = false;

	        if (stage >= 2 && stage <= 4) {
	            Roomcheck = roomnumber >= 1 && roomnumber <= 6;
	        } else if (stage >= 5 && stage <= 7) {
	        	Roomcheck = roomnumber >= 1 && roomnumber <= 3;
	        } else if (stage >= 8 && stage <= 9) {
	        	Roomcheck = roomnumber >= 1 && roomnumber <= 2;
	        }

	        if (Roomcheck) {
	            this.room = newroom;
	        } else {
	            this.room = default_room;
	        }
	    } else {
	        this.room = default_room;
	    }
	}


	
	@Override
	public String toString() {
		return "Gender:"+ gender + " Room:" + room;
	

}
}

