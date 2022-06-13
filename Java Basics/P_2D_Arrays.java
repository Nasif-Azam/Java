class Students {
	String Name;
	String Roll;
}

public class P_2D_Arrays {

	public static void main(String[] args) {
		Students S1 = new Students();
		Students S2 = new Students();
		Students S3 = new Students();
		Students S4 = new Students();
		S1.Name = "Nasif";
		S1.Roll = "21";
		S2.Name = "Azam";
		S2.Roll = "2";
		S3.Name = "Jarin";
		S3.Roll = "15";
		S4.Name = "Zisha";
		S4.Roll = "5";
		Students S_Array[][] = { { S1, S1 }, { S2, S2 }, { S3, S3 }, { S4, S4 } };
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < 4; j++) {
//				System.out.println("\t\t" + S_Array[i][j].Name + "\t" + S_Array[i][j].Roll);
//			}
//		}
		System.out.println(S_Array[2][2]);

	}

}
