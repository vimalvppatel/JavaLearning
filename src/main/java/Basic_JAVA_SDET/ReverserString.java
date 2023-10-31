package Basic_JAVA_SDET;

public class ReverserString {
	public static void main(String[] args) {

		String ss = "fsdsssss";
		String aa = "";

		for (int x = ss.length() - 1; x >= 0; x--) {

			aa = aa + ss.charAt(x);

		}

		System.out.println(aa);
	
	
	
	//Using char array
	
	String abc = "5555555555555qqqqqqqqqqq";
	char q[]=  abc.toCharArray();
	String a2a= "";
	
	for(int s=q.length-1; s>=0; s--) {
		a2a = a2a+q[s];
		
	};
	System.out.println(a2a);
}}
