package variable;

public class RecursionPractice {
	
	static int factorial (int n) {
		
	     if (n==0 || n==1) {
	    	 return 1;
	     }
	     
	     else {
		return n * factorial (n-1);
	    }
 	}

	 public static void main(String[]args) {
		 int x = 10;
		 System.out.println(factorial(x));
	  }	
	}
/*
public class Main {
     
     Static int recreation(int n){
     if (int n == 0; n==1;)
    return1;
   }
     else {
     return n * factorial (n-1);
   }
    public static void main(String []args){
     int a = 5;
     System.out.println (factorial(x));
   }
 }
 */