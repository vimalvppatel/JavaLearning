package variable;

import variable.PrintNumber;

public class PrintNumber {
 
	    private int age;        //Static variable Or Class variables
		private String name;    //Static variable Or Class variables
		
		
	      public PrintNumber() {
	    	  System.out.println ("****************constructor************");
	    	   age = 21;              // Local Variable
	    	   name = "Vimal Patel";  // Local Variable  
	    	 }  
	      
	     public static void main(String[]args) {
	    	 PrintNumber Info = new PrintNumber();
	         System.out.println(Info.age);
	         System.out.println(Info.name);
	         
	      }
	    }
		
}

