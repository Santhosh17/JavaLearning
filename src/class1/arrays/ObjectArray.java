package class1.arrays;

public class ObjectArray {
	public static void main(String[] args) {
		// if we create array of Object class we can store multiple types of datatypes
		// in that
		Object ar[] = new Object[5];
		ar[0] = "Hello";
		ar[1] = 1234;
		ar[2] = "21";
		ar[3] = true;
		ar[4] = 43.53;

		int arrayLength = ar.length;
		System.out.println(arrayLength);

		for (int i=0;i<arrayLength;i++){
			System.out.println(ar[i]);
		}
	}
}
