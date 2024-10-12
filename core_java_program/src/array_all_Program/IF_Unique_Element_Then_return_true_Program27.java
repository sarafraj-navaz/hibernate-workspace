package array_all_Program;

public class IF_Unique_Element_Then_return_true_Program27 {
	public static void main(String[] args) {
//		int[] a = { 1,2,3,4,5};
		int[] a = { 12, 23, 45, 12, 45, 24, 45 };
		if (checkUniqui(a)) {
			for (int a1 : a) {
				System.out.print(a1 + " ");
			}
		}else
			System.out.println("in the arrays Doublicate element is present");
	}

	public static boolean checkUniqui(int[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (a[i] == a[j]) {
					count++;
					a[j] = a[n - 1];
					j--;
					n--;
				}
			}
			if (count > 1)
				return false;
		}
		return true;
	}
}
