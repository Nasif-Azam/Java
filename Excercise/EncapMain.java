
public class EncapMain {
	public static void main(String[] args) {
		Encap P = new Encap();
		P.eat();
		P.walk();
		P.setName("Nasif");
		P.setAge(22);

		System.out.println(P.getName() + "\n" + P.getAge());
	}
}
