package exercises;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
public class Hash {




        public static void main(String[] args) {
            HashMap<Double,String> students = new HashMap<Double, String>();
            Scanner input = new Scanner(System.in);
            String newStudent;
            Double studentId;

            do {




                if (students.size() != 3) {
                    System.out.println("enter student name ");
                    newStudent = input.nextLine();
                    System.out.println("enter student's id ");
                    studentId = input.nextDouble();
                    students.put(studentId, newStudent);
                    input.nextLine();

            } else {
                    break;
                }

            }
            while (!students.equals("")) ;

            System.out.println((students.keySet()));
            for (Double student : students.keySet()) {
                System.out.println(student);
            }
            for (String student : students.values()) {
                System.out.println(student);
            }
            for (Map.Entry< Double, String> student : students.entrySet()) {
                System.out.println(student.getKey() + " (" + student.getValue() + ")");

            }
    }
}
