package variable;

public class TryCatchStatment {
	
	public static void main(String[]args) {
		
		try {
			int [] CarNum = {1,2,3,4,5};
			System.out.println(CarNum[10]);
		   }
		
	    catch (Exception e) {
			System.out.println("Somthing Went Wrong");
		    }
		
 	    finally {
		   System.out.println("The 'try catch' is finished.");
		
	   }
	}
}
