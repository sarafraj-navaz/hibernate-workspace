package array_all_Program;

public class Remove_Doublicate_Element_from_Arrays_Program26 {
	public static void main(String[] args) {
		int[] a = { 12, 23, 45, 12, 45, 24, 45 };
		getUniquiElement(a);
	}

	public static void getUniquiElement(int[] a) {
		int n = a.length - 1;
		for (int i = 0; i < n; i++) {
			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (a[i] == a[j]) {
					a[j] = a[n - 1];
					count++;
					j--;
					n--;
				}
			}
		}
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			b[i] = a[i];
		}
		// for print
		for (int a1 : b) {
			System.out.print(a1 + " ");
		}
	}
}
