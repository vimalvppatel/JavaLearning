package variable;

public class human extends pen2 implements basicAnimal {

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("Speaking");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("sleeping");
	}

	@Override
	public void written() {
		// TODO Auto-generated method stub
		System.out.println("writing");
	}

	@Override
	public void refill() {
		// TODO Auto-generated method stub
		System.out.println("Refilling");
	}
	   
	   
	   
	   public static void main (String[]args) {
		   
		   human VP = new human();
		   VP.sleep();
		   VP.refill();
		   VP.speak();
		   VP.sleep();
		   
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
   }

