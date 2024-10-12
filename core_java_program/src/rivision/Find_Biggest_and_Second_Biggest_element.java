package rivision;

public class Find_Biggest_and_Second_Biggest_element {
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 9, 7, 8, 5};
        printBiggestAndSecondBiggest(array);
    }

    /**
     * Finds and prints the largest and second largest elements in the array.
     * If the array has less than two unique elements, it handles the scenario gracefully.
     *
     * @param array The input array of integers.
     */
    public static void printBiggestAndSecondBiggest(int[] array) {
        if (array.length < 2) {
            System.out.println("Array must contain at least two elements.");
//            return; 
        }
        else {
            int max = Integer.MAX_VALUE;
            int secondMax = Integer.MAX_VALUE;

            for (int num : array) {
                if (num < max) {
                    // Update secondMax before updating max
                    secondMax = max;
                    max = num;
                } else if (num < secondMax && num < max) {
                    secondMax = num;
                }
            }

            // Check if secondMax was updated from its initial value
            if (secondMax == Integer.MAX_VALUE) {
                // This can happen if all elements are equal or there is no distinct second maximum
                System.out.println("There is no distinct second largest element.");
            } else {
                System.out.println("Biggest element: " + max);
                System.out.println("Second biggest element: " + secondMax);
            }
        }
    }
}

