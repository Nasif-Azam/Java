
class Emp {
	int id = 0;
	String name;
	int salary;
//	String ceo = "Nasif";
	static String ceo;
	static String manager = "Azam";

	static {
		manager = "AZAM";
		System.out.println("In Static1");
	}

	public Emp() { // When create an objects (Execute multiple times)
		System.out.println("In Constructor");

	}

	static { // When load a Class (Execute 1 time)
		ceo = "NASIF";
		System.out.println("In Static2");
	}

	public void showProf() {
//		id++;
		System.out.println(
				"ID: " + id + " NAME: " + name + " SALARY: " + salary + " CEO: " + ceo + " Manager: " + manager);
	}
}

public class _8_Static_Keywords {

	public static void main(String[] args) {

		Emp Zisha = new Emp();
//		Zisha.id = Zisha.id + 1;
		Zisha.name = "Zisha";
		Zisha.salary = 15000;

		Emp Jarin = new Emp();
//		Jarin.id = Jarin.id + 1;
		Jarin.name = "Jarin";
		Jarin.salary = 5000;

//		Emp.ceo = "Nasif";
//		Emp.manager = "Azam";
		Zisha.showProf();
		Jarin.showProf();
	}

}
