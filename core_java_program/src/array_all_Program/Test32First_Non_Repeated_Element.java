package array_all_Program;

public class Test32First_Non_Repeated_Element {
    public static void main(String[] args) {
        int[] a = {9, 4, 9, 6, 7, 4};
        getFirstNonRepeatedElement(a);
        System.out.println("ss");
    }

    public static void getFirstNonRepeatedElement(int[] a) {
        for (int i = 0; i < a.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < a.length; j++) {
                if (i != j && a[i] == a[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.println("The first non-repeated element in the array is " + a[i]);
                  return;
            }
        }
        System.out.println("No non-repeated elements found in the array.");
	}	
}
