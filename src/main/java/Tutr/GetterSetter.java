package Tutr;

public class GetterSetter {
	
	
	private	int id;
	private String name;
	private	long phno;         // Private modifier data ko execute karne ke liye getter setter ka use kiya jata he.
		                                  // Automatically getter setter ko open karne ke liye 
	                                      // Source >>> Click to Generat getter setter option  
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public long getPhno() {
			return phno;
		}
		public void setPhno(long phno) {
			this.phno = phno;
		}
		
			
		public static void main(String[]args) {
			
		GetterSetter Details = new GetterSetter();
	    Details.id=0;
		Details.setId(10);
		System.out.println(Details.getId());
		
		Details.setName("Vimal Patel");
		System.out.println(Details.getName());
		
		Details.setPhno(1234567789);
		System.out.println(Details.getPhno());
		
	   }
   	  }
	
	

