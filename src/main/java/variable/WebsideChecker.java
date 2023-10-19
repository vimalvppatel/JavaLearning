package variable;

import java.util.Scanner;

public class WebsideChecker {

	public static void main(String[] argsl) {       
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String website = sc.nextLine();
		
		if (website.endsWith("org")) {
			System.out.println("This is organization website");
		}
		
		else if (website.endsWith(".com")) {
			System.out.println("This is commercial website");	
		}
	     
		else if (website.endsWith(".in")) {
			System.out.println("This is Indian website");
		}

	}

}
