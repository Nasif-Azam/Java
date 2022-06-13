
class Student {
	int Roll;
	String Name;
}

public class _10_Arrays {

	public static void main(String[] args) {
		int num[] = new int[4];
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		num[3] = 4;
//		int num[] = { 1, 2, 3, 4 };
		for (int i = 0; i < 4; i++) {
			System.out.print(num[i] + " ");
		}

		Student S1 = new Student();
		Student S2 = new Student();
		Student S3 = new Student();
		Student S4 = new Student();
		Student S_Array[] = { S1, S2, S3, S4 };
		S1.Name = "Nasif";
		S1.Roll = 21;
		S2.Name = "Azam";
		S2.Roll = 1;
		S3.Name = "Jarin";
		S3.Roll = 15;
		S4.Name = "Zisha";
		S4.Roll = 5;
		System.out.println("\nStudents Info:\t" + "Name" + "\tRoll");
//		System.out.println("\t" + S1.Name + "\t" + S1.Roll);
//		System.out.println("\t" + S2.Name + "\t" + S2.Roll);
//		System.out.println("\t" + S3.Name + "\t" + S3.Roll);
//		System.out.println("\t" + S4.Name + "\t" + S4.Roll);
		for (int i = 0; i < 4; i++) {
			System.out.println("\t\t" + S_Array[i].Name + "\t" + S_Array[i].Roll);
		}

		int twoD_Arr[][] = { { 1, 2, 3, 7, 7, 7 }, { 4, 5, 6, 7, 7 }, { 7, 8, 9, 7 } };
		for (int row = 0; row < twoD_Arr.length; row++) {
			for (int colm = 0; colm < twoD_Arr[row].length; colm++) {
				System.out.print(twoD_Arr[row][colm] + " ");
			}
			System.out.print("\n");
		}
	}

}
