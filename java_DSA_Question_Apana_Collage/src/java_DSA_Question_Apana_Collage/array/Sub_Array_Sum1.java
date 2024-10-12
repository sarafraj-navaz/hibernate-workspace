package java_DSA_Question_Apana_Collage.array;

public class Sub_Array_Sum1 {
	public static void subArray(int number[]) {
		//start
		for(int i=0;i<number.length;i++) {
			int start=i;//not use this line for better understanding 
			//i have write this code
			for(int j=i;j<number.length;j++) {
				int end=j;
				int SubArray_Sum=0;
				//for the print start to end
				for(int c=start;c<=end;c++) {
					System.out.print(number[c]+" ");
					SubArray_Sum = SubArray_Sum+number[c];
				}
				System.out.println("          sub ArraySum "+SubArray_Sum);
				System.out.println(" ");
			}
		System.out.println("=======");	
		}
	}
	public static void main(String[] args) {
		int number[] = {2,4,6,8,10};
		subArray(number);

	}

}
