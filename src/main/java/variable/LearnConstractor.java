package variable;

public class LearnConstractor {
	int id;
	int Name;
	
   public void Userdata() {   
	  System.out.println("Hello User");
	  }
	
	public void Userdata(int a) { 
		System.out.println(a); 
	  }
	
	public void Userdata(int a, String name) {
		System.out.println(a);
		System.out.println(name);
	}
	 
     public static void main(String[] args) { 
		// TODO Auto-generated method stub
    
    	 LearnConstractor LC = new LearnConstractor(); 
    	 LC.Userdata();
    	 LC.Userdata(20);
    	 LC.Userdata(10, "Vimal");
    	 LC.Userdata(10);
   
       }

}















