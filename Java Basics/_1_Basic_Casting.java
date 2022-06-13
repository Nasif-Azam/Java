
public class _1_Basic_Casting {

	public static void main(String[] args) {
		int num = 30, code = (int) 10.07; // 4 bytes=32bit
		long lrgNum = 123_456_789L; // 8 bytes=64bit
		float price = 12.55F; // 4 bytes=32bit
		double point = 12.5451D; // 8 bytes=64bit
		char sinChar = 'Z'; // 2 byte=16bit-> 0 to 65,536 (unsigned)
		boolean isPerfect = false;
		String mulChar = "Zisha";
		byte z = 127; // 1 byte=8bit-> -128 to 127
		short s = 12111; // 2 bytes=16bit-> -32,768 to 32,767

		System.out.println('N');
		System.out.println("Hello Nasif");
		System.out.println(num);
		System.out.println(lrgNum);
		System.out.println(point);
		System.out.println(price);
		System.out.println(sinChar);
		System.out.println(mulChar);
		System.out.println(mulChar.toUpperCase());
		System.out.println(mulChar.toLowerCase());
		System.out.println(mulChar.length());
		System.out.println(isPerfect);
		casting();
	}

	static void casting() {
		int integer = 9;
		double dbl = integer;

		double dbl1 = 23.999D;
		int integer1 = (int) dbl1;

		System.out.println(integer);
		System.out.println(dbl);

		System.out.println(dbl1);
		System.out.println(integer1);

		System.out.println("AND Comperission: " + (3 < 5 && 3 < 10));
		System.out.println("OR Comperission: " + (3 < 3 || 3 < 1));

		// Type Castings are:
		// byte--> short--> int--> long--> float--> double
		/// char--> int

	}
}
