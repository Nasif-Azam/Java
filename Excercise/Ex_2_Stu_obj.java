import java.util.ArrayList;

public class Ex_2_Stu_obj {
	ArrayList<Ex_2_Student> student_info;
	String name;
	int id, score;

	public Ex_2_Stu_obj(String name, int id, int score) {
		this.name = name;
		this.id = id;
		this.score = score;

//		student_info = new ArrayList<Ex_2_Student>();
//		student_info.add(new Ex_2_Student(name, id, score));
//		System.out.println(student_info);
	}

	void Display() {
		System.out.println("Name: " + name + "\tID: " + id + "     Score: " + score);
//		for (int i = 0; i < student_info.size(); i++) {
//			System.out.println(student_info.get(i));
//		}
	}

	public static void main(String[] args) {

	}

}
