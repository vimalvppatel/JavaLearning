package Tutr;

public class MethodOverLoading {
    static void Userdata(int a) {
        System.out.println(a * 10);
    }

    static void Userdata(String xyz) {
        System.out.println(xyz + " Vimal ");
    }

    static void Userdata(boolean V) {
    	System.out.println(false);
    }
    
    public static void main(String[] args) {
        Userdata(5);
        Userdata("Patel");
 
    }
}
