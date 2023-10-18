package Tutr;

public class ArrayPracticeSet {

    public static void main(String[] args) {
    	
        String[] name = {"Vimal", "Mayank", "Gautam", "Mohit", "Milan"};

        float[] marks = {29.5f, 30.9f, 80.09f, 50.9f, 59.0f};

        for (int j = 0; j < name.length; j++) {
            System.out.println(name[j]);
        }

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
         }
        
        float sum = (marks[0]+marks[1]+marks[2]+marks[3]+marks[4]);
        System.out.println(sum);
        
        
        
        
        
    }
}
