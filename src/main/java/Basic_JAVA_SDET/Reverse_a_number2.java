package Basic_JAVA_SDET;

public class Reverse_a_number2 {
	public static void main(String[] args) {
//Using String buffer class
		 int num = 123456789;
	
		 String s=  String.valueOf(num);
		 
		 StringBuffer d = new StringBuffer(s);
		 System.out.println(d.reverse());
		 
//String build class
		 int num1 = 122333;
		String ss= String.valueOf(num1);
		String ddss = "sdgghfdgbfdxvdfbhfbhfdgedfbf";
	StringBuilder dd = new StringBuilder(ss);
	System.out.println(dd.reverse());		 
		 
		 
	}
		 
  }