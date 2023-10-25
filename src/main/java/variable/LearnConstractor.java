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
	
     public static void main(String[] args) {
		// TODO Auto-generated method stub
    
    	 LearnConstractor LC = new LearnConstractor();
    	 LC.Userdata(5);
    	 LC.Userdata();
   
     

	}

}
