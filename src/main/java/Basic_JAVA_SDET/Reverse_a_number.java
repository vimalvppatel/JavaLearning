package Basic_JAVA_SDET;

public class Reverse_a_number {
	public static void main(String[] args) {
//Using while loop
		 int num = 123456789;
		 int rev = 0;
		 
		 
		 while(num!=0) {
			 rev = rev*10+ num%10;
			 num = num/10;
    }
		 System.out.println(rev);
    }
  }