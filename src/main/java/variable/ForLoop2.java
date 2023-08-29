package variable;

public class ForLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i =1;
		for (i=0;i<2;i++) {
		System.out.println("outer:" + i);
		
		int j = 0;
		for (j = 1; j<3 ; j++) {
	    System.out.println("Inner" + j);   
	    
	  }
	}
  }
}