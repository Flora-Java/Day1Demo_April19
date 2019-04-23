import java.util.Scanner;

public class exercise2 {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner (System.in);
		
		int numero = 0;
		double doble;
		double doble1;
		double totaldoble;
		char contin = 'y';
		char contin1;
		
		System.out.print("Enter a number: ");
		numero = scnr.nextInt();
		System.out.println(++numero);
		
		System.out.print("Enter a number: ");
		doble = scnr.nextDouble();
        doble = doble + .5;
        System.out.println(doble);
        
		System.out.print("Enter a number: ");
		doble = scnr.nextDouble();

		System.out.print("Enter another number: ");
		doble1 = scnr.nextDouble();
		totaldoble = doble + doble1;
		
		System.out.println(totaldoble);
		
		while (contin == 'y' ) {
			
			System.out.println("Hello, World! Echooo");
			System.out.print("Would you like to continue(y/n)? ");
			contin = scnr.next().charAt(0);
			contin1 = Character.toLowerCase(contin);
			contin =contin1;
		}
		
	}

	
}
