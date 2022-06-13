public class StudentData {
	String name;
	int id, score;

	public StudentData(String name, int id, int score) {
		this.name = name;
		this.id = id;
		this.score = score;
	}

	public void display() {

		System.out.println("ID: " + id + "\t   Name: " + name + "\tScore: " + score);

	}

}
