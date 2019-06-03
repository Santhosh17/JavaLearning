package class2.staticNonStatic;

public class Static_And_Nonstatic {

	// global variables - used across all function - conditions
	String name;// non static global variable
	static int age; // static global variable

	public static void main(String[] args) {// static function

		name = "mysore"; //static method cannot contain non static variable
		age = 18; //static method can contain static variable
		
		sum(); //static method can call static methods inside it
		sendMail(); //static method cannot call non static methods inside it
		

	}

	public static void sum() {// static function
		int i = 100;// local variable
	}

	public void sendMail() { // non static
		int y = -300;
		
		name = "mysore"; //non static method can contain non static variable
		age = 18; // non static method can contain static variable
		
		sum(); // non static method can call static methods inside it
		sendMail(); // non static method can call non static methods inside it
		
	}

}
