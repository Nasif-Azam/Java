
class varArg {
	public int sum(int... n) { // n[]={5, 10, 5, 10, 15, 15, 40};
		int sum = 0;
		for (int i : n) {
			sum = sum + i;
		}
		return (sum);
	}
}

public class _12_VarArgument {

	public static void main(String[] args) {
		varArg obj = new varArg();
		int num[] = { 1, 2, 3, 4, 5 };
		int size = num.length;
		int add = 0;
		for (int i = 0; i < size; i++) {
			add = add + i;
		}
		System.out.println(add);
		System.out.println(obj.sum(5, 10, 5, 10, 15, 15, 40));
	}

}
