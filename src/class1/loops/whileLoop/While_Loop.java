package class1.loops.whileLoop;

public class While_Loop {
	public static void main(String[] args) {
		int i ;// Initialization of a variable of type int
		i=0;// declaring a value (of int type) to variable i 
		
		while (i<10) { // condition
			System.out.println(i);
			i=i+1; // incrementation /decrementation
		}
		
		i=0;
		while (i<10) { // condition
			System.out.println(i);
			i++; // incrementation /decrementation
		}
		
		i=10;
		while (i>0) { // condition
			System.out.println(i);
			i--; // incrementation /decrementation
		}
	}
}