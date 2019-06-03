package class1.functionsBasics;

public class Functions_PassInvalues {
	public static void main(String[] args) {
		sumAll(1,2,3);
		sumAll("Hello",2,3);
		sumAll(10,22,3);
		
		String country ="India";// This is a local variable for main method

	}
	public static void sumAll(int a, int b, int c) {
		int sum = a+b+c; // Sum is a local variable
		System.out.println("sum = "+sum);
	}
	public static void sumAll(String a, int b, int c) {
		System.out.println(a+b+c);
	}
}
