package class1.loops.forLoop;

public class ForLoop {

	public static void main(String[] args) {

		// Basic for loop 
		for (int i = 0; 
				 i < 5; 
				 i++) {
			System.out.println(i);

		}
		
		// Below program is a logic to find the sum of numbers ex: sum of 1st 100 numbers
		int sum = 0;
		int j =100;
		for(int n=0;n<=j;n++) {
			sum=sum+n;
		}
		System.out.println("Sum of 1st "+ j +" numbers is "+sum);
		

	}
}