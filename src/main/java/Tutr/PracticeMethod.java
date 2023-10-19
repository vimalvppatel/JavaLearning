package Tutr;  // This is package
 
public class PracticeMethod {  // This is class and if we dont have static in the class than we need to create class name object and than call the method.
	
	    void name2 (String Name) {   
		System.out.println(Name + " Patel");
	}
	 
 	    static void username (int x) {   
 	     System.out.println(x * 10);
	   }
	    
	   public static void main(String[]args) {
	     PracticeMethod m = new PracticeMethod();
		 m.name2("Vimal"); 
		 m.name2("Gautam");
		 username(90);
		 
	   }
}
