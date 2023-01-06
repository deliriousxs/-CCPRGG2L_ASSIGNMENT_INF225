import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // Java program to check if a student number is valid
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter email address: ");
        String studentEm = scan.nextLine();

        // Long method
         Pattern pattern = Pattern.compile("\\w+@students.national-u.edu.ph");
         Matcher matcher = pattern.matcher(studentEm);

        boolean match = matcher.matches();

        if (match) {
            System.out.println("valid student email address");
        } else {
            System.out.println("invalid student email address");
        }
        
     
        System.out.print("Enter phone number: ");
         studentEm = scan.nextLine();

        // Long method
        pattern = Pattern.compile("09+[0-9]{9}");
         matcher = pattern.matcher(studentEm);

        match= matcher.matches();

        if (match) {
            System.out.println("valid phone number");
        } else {
            System.out.println("invalid phone number");
        }
}
}
