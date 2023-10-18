package Tutr;


class Userdata {
	int id ;
	String name ;
	
public void printdetails(){
   
	 System.out.println("my id is"+ id);
	 System.out.println("My name is" + name);
	}
}

  public class MethodClassINOOPS {
	  public static void main(String[]args) {
		 System.out.println("This is our custom class");
		 Userdata id = new Userdata();
		 Userdata name = new Userdata();
 
		int id1 = 20;
		String nString = "Vimal Patel";
		System.out.println(id1);
		 System.out.println(nString);
	  }
	}


