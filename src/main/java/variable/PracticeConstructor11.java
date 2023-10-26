package variable;

import variable.PracticeConstructor11;

public class PracticeConstructor11 {    // CLASS NAME    
    private int age;  
	private String name;
	private int id;
	Boolean d;

//    public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {   // this :- Current object refrence
//		this.name = name;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public static void main(String[]aargs) {     
//		PracticeConstructor details = new PracticeConstructor();
//		details.setAge(11);
//		System.out.println(details.getAge());
//		
//		details.setId(21);
//        System.out.println(details.getId());
//        
//        details.setName("Vimal Patel");
//        System.out.println(details.getName());
//	}
	
	 // Constructor for the PracticeConstructor class
/*  public PracticeConstructor11() {    //METHOD OVERLAODING :- (Same Method Name But Different Parameter)  
    	 System.out.println("Normal constructor");
         age = 10;
         name = "Vimal";
         id = 21;
         System.out.println(age+"   "+name+"  "+id);
    }
	  
	 public PracticeConstructor11(int x) {    //METHOD OVERLAODING :- (Same Method Name But Different Parameter)
		 System.out.println("Param constructor");
		  int a = 10;
		  int b = 20;
		  int c = a+b;
		  System.out.println(a+"   "+b+"  "+c);
	}**/
   
       public static void main(String[]args) {
       PracticeConstructor11 VP = new PracticeConstructor11(22,"Ankit",123456, false);   //new PracticeConstructor11 :- Default Constructor
       System.out.println( VP.age);
       System.out.println( VP.id);
       System.out.println( VP.name);
       System.out.println( VP.d);
       }


	public PracticeConstructor11(int age, String name, int id, Boolean d) {
		
		this.age = age;    // this :- Refrence of the current object
		this.name = name;
		this.id = id;
		this.d = d;
	}    
   }

