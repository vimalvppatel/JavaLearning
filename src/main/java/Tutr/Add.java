package Tutr;  // This is package

public class Add {    // This class   yadi static nahi prasent rhta he to hm direct print nahikr skte to hame class ka object banakar code ko execute krna pdta he.
	
  public String say() {      // Function ya Method yadi method me strng likha he to kewal hm string type ka hi data de skte he wrna error occured hogi.
	
	System.out.println("Hello");
	String name = "Ankitsffgsdgvsdfgv";
	return name;
}

  public void say2() {           // Second function/ Method 
	
	System.out.println("Hello2");
}

  public int add() {
	int x =2;
	int y =3;
	int z = x+y;
	return z;
}

  

  public static void main(String[] args) {   // main function/method ke bina code execute nahi kar skte
	
   Add s = new Add();    // Class ka object
   String abc=s.say();
    System.out.println(abc);   // Class name ke object ko call kiya
    
   int d= s.add();    // Second object
   System.out.println(d);   // Object ko print kiya
  
    }
  }
