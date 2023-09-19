package variable;

public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[]name = {"Linites","Infobeans","47 Billion","Yash technology","NCS"};
		String[]jobs = {"Quality assurance", "Frontend developer", "Backend developer","Team lead","Project manager"};
		int i = 0;
		 for(i=0; i<name.length;i++) {
			System.out.println(name[i]);
		}
		 System.out.println(" ");

		 for(i=0; i<jobs.length;i++) {
			 System.out.println(" ");
			 
		 System.out.println(name[i] + jobs[i]);
		 
	  }
	}
  }