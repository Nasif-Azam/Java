import java.util.Scanner;

public class Ex_2_Student {
	private String name;
	private int id;
	private int score;

	public Ex_2_Student(String name, int id, int score) {
		this.name = name;
		this.id = id;
		this.score = score;

		Ex_2_Stu_obj Info = new Ex_2_Stu_obj(name, id, score);
		Info.Display();
//		System.out.println(name + id + score);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Sname;
		int Sid, Sscore;

		System.out.println("Enter student name: ");
		Sname = sc.next();
		System.out.println("Enter student ID: ");
		Sid = sc.nextInt();
		System.out.println("Enter student Score: ");
		Sscore = sc.nextInt();
		Ex_2_Student S1 = new Ex_2_Student(Sname, Sid, Sscore);

	}

}
