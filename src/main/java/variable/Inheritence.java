package variable;
 
class base {      // Base class 
	
	public int x;   // public data

	public int getX() {      // crteate getter and setter automatically from the source section
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}	
}

   class Derived extends base{   // Create Derived class and and extend all the base class
	 public int y ;    // public data
 
	 public int getY() {    // create getter and setter from the source option
		return y;
	}

	public void setY(int y) {
		this.y = y;
	  }	 
   }

public class Inheritence {   // jo first time class create karte he ye vo wali class he

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		base b = new base ();   //  base class ka ek object banaya he
		Derived D = new Derived ();
		
		D.setY(20);          // Y ka data object ki help se pahle set karwaya 
		System.out.println(D.getY());   // object ki help se data ko get karke print kiya
		
		b.setX(10);   // X ka data object ki help se pahle set karwaya 
		System.out.println(b.getX());   // object ki help se data ko get karke print kiya
		 
	}

}
