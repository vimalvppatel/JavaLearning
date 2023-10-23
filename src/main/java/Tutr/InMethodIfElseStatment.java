package Tutr;

public class InMethodIfElseStatment {
	
	 void age(int x) {
		
		if (x > 18) {
        System.out.println("Right");		
        }
	 
		else {
			System.out.println("Wrong");
		  }
		}
	 
	  public static void main(String [] args) {
	    	 
	  InMethodIfElseStatment user = new InMethodIfElseStatment();
	  
	  user.age(10);
	     
	}

}
