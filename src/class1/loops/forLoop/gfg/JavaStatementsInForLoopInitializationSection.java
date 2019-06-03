package class1.loops.forLoop.gfg;

public class JavaStatementsInForLoopInitializationSection{
	public static void main(String[] args) {
		int i = 0;
		for (System.out.println("HI"); i < 5; i++)
			System.out.println("HELLO GEEKS");
	}
	// In the initialization section we can take any valid java statement 
	// including System.out.println(). In the for loop initialization section is executed only once
	// that’s why here it will print first HI and after that HELLO GEEKS
}
