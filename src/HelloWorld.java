import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {

		System.out.println("Hello \n");  //\n add a new line
		System.out.println("World");
		
		// This is an example of a single line comment
		
		/*
		 example of a block comment usually used for multiple block comments, also useful 
		 for generating our own Java documentation
		 */
		
		// this is a Scanner object -- Let us take in user input
		
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter your age: ");
		int num = scan.nextInt();
		
		System.out.println(num);
		// garbage line -- this cleans out the scanner to take in different tupes of input
		// necessary when going from numeric input to scan.nextline()
		
		scan.nextLine();
		
		System.out.println("Enter name and lastanme: ");
		String fullName = scan.nextLine();
		System.out.println();
		System.out.println(fullName);
		
		// This is a constant and can not be changed
		
		final String TEST = "Grand Circus";
		
		//primitive data type
		
		byte b = 127;
		short s = 128;
		
		long l = 28785950505L; // longer needs to be specified if the number assigned 
		// initially is smaller than maximum value
		
		float f = 56.7F; // need
		double d = 56.7;
		char c = '@'; // needs sinle quotes ' not doble ";
		boolean bool = true;
		
		
		System.out.println(9%5);  // an operation can be done in the sysout
		
		
		s++; // post increment 
		s--; // decrease  value
		++s; // pre increment
		
		int x = 5;
		x += 8;
		
		String cadena = "this is a sentence";
		cadena += " and I added some more words";
		// cadena = cadena + " and I added some more words"); funciona igual que arriba 
		
		int myage = 21;
		double age = myage;
		// this is a implicit casting
		// going from a less precise type to a more precise type
		
		// explicit casting
		// when going from more precise to a less precise type
		
		double total = 258.54;
		int newTotal = (int) total ; // truncate the decimal places
		
		
		
		
		
		
		scan.close();  // this indicate that the scanner will be closed, so not used anymore
	}

}
