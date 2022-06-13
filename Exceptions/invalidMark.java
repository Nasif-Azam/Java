package ExceptionsPractice;

public class invalidMark extends Exception {
	private int marks;

	public invalidMark(int mark) {
		marks = mark;
	}

	public String toString() {
		return "Invalid Mark: " + marks;
	}

	public static void main(String[] args) throws invalidMark {
		int mark = -10;
		if (mark <= 0 || mark > 100) {
			throw new invalidMark(mark);
		}
	}
}
