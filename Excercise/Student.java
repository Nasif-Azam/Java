import java.util.ArrayList;
import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		ArrayList<StudentData> studentList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String Sname;
		int Sid, Sscore;

		System.out.println("Enter student name: ");
		Sname = sc.next();
		System.out.println("Enter student ID: ");
		Sid = sc.nextInt();
		System.out.println("Enter student Score: ");
		Sscore = sc.nextInt();

		StudentData s1 = new StudentData(Sname, Sid, Sscore);
		StudentData s2 = new StudentData(Sname, Sid, Sscore);
		studentList.add(s1);
//		studentList.add(s2);
		display(studentList);
	}

	public static void display(ArrayList<StudentData> studentList) {

		for (int i = 0; i < studentList.size(); i++) {
			studentList.get(i).display();
		}
	}
}
