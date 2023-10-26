package variable;

class base1 {
	
	     int x ;
	     public int getx() {  
			return x;
		}

		public void setx(int x) {
			this.x = x;
	     
	    }
	}  
	   class Derived extends base1 {

	    public int y;
	    
	     public int getY() {    
			return y;
		}

		public void setY(int y) {
			this.y = y;
	        
	        }
	   public class Main {
	   public static void ain(String[] args) {
	    Derived d = new Derived();
	    d.setx(50);
	    d.setY(100);
	    System.out.println(d.getx());
	    System.out.println(d.getY());
	    
	    } 
	   }
	 }
