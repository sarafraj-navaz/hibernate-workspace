package java_DSA_Question_Apana_Collage.array;

public class SubArray {

	public static void pair(int number[]) {
		int maxTotal=Integer.MIN_VALUE;
		int minTotal=Integer.MAX_VALUE;
    for(int i=0;i<number.length;i++) {
    	int start=i;
    	for(int j=i;j<number.length;j++) {
    		int end=j;
    		int max=0;
    		for(int c=start;c<=end;c++) {
    			
    			System.out.print(number[c]+" ");
    			
    			max=max+number[c];
    			
    		}
			/* System.out.print("max===  "+max); */
    		if(maxTotal<max) {
    			maxTotal=max;
    		}
    		if(minTotal>max) {
    			minTotal=max;
    		}
    		System.out.println(" ");
    		
    	}
    System.out.println(" ");	
    }
    System.out.println("maxSub Total== "+maxTotal);
    System.out.println("minSub total === "+minTotal);
	}
	public static void main(String[] args) {
		int number[]= {2,4,6,8,10};
		pair(number);
	}

}
