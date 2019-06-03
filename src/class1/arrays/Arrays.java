package class1.arrays;

public class Arrays {

	public static void main(String[] args) {

		String username = "xxxx";
		String password = "yyyy";
		String email = "abc@gmail.com";
		String zip = "123";
		String city = "mysore";
		
		//Arrays
		// read the data from xls and put it inside the arry. 
		String str[] = new String[5];
		str[0]="xxxx";
		str[1]="yyyy";
		str[2]="abc@gmail.com";
		str[3]="123";
		str[4]="mysore";
		
		int i[] = new int[5];
		i[0] =300;
		i[1] =301;
		i[2] =302;
		i[3] =303;
		i[4] =304;
		
		char c[] = new char[5];

		// length of array
		System.out.println(str.length);
		System.out.println(i.length);
		
		for (int x=0; x<str.length;x++) {
			System.out.println(str[x]);
		}
		
		for (int y=0; y<i.length;y++) {
			System.out.println(i[y]);
		}
		
		for (int z=i.length-1; z>=0;z--) {
			System.out.println(i[z]);
		}
	}
 
}
