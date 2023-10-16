package variable;

import java.util.Scanner;

public class IFelseELSEesle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if (age < 10) {
			System.out.println("I am children");
		}
    
		else if (age < 20) {
			System.out.println("I am unmarried");
		}
		
		else if (age < 30 ) {
			System.out.println("I am mature ");
		}
		
		else {
			System.out.println("I am old man");
			
		}
	}

}
