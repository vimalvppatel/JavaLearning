package Tutr;

public class NewGTST {

	private int id;
    private String name;
    private long phno;
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
		    	
		  NewGTST vp = new NewGTST();
		  
		  vp.setId(5);
		  System.out.println(vp.getId());
		    	
		  vp.setName("Vimal patel");
		  System.out.println(vp.getName());
		  
		  vp.setPhno(1223456654);
		  System.out.println(vp.getPhno());
		  
    }
     }

