package Encapculation;

public class StudentInfoMain {

	public static void main(String[] args) {
		StudentInfo SI = new StudentInfo();
		SI.setID(211015006);
		System.out.println("Name: " + SI.getName() + "\nID: " + SI.getID());
	}

}
