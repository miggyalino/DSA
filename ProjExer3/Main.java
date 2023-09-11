
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<>();
        try {
           Scanner input = new Scanner(new File("student.txt")); 
           while(input.hasNextLine()){
            String student_ID = input.nextLine();
            String last_name = input.nextLine();
            String first_name = input.nextLine();
            char gender = input.nextLine().charAt(0);
            String course = input.nextLine();
            int yearLevel = Integer.parseInt(input.nextLine());

            Student new_student = new Student(last_name,first_name,student_ID,course,gender,yearLevel);
           }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
    }
}
