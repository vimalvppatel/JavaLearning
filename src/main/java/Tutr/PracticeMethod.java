package Tutr;  // This is package
 
public class PracticeMethod {  // This is class and if we dont have static in the class than we need to create class name object and than call the method.
	
	    void name2 (String Name) {  // String and name are the parameter in this method 
		System.out.println(Name + " Patel");
	}
	 
 	    static void username (int x) {   // static is present in this method thats why we can directly call the method.
 	     System.out.println(x * 10); // 
	   }
	    
	   public static void main(String[]args) {  // Main method is very important to execurte the code with this is line we cant do anything
	     PracticeMethod m = new PracticeMethod();  // Class Name object
		 m.name2("Vimal");  // vimal and gautam are the argumanet in this method
		 m.name2("Gautam"); // vimal and gautam are the argumanet in this method
		 username(90);  /// 90 is argument
		 
	   }
}
