import java.util.Scanner;

public class IT24100576Lab7Q1B{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        for (int student = 1; student <= 3; student++) {
            System.out.println("Student " + student);

            
            System.out.println("Enter marks: ");
            double subject1 = input.nextDouble();
            double subject2 = input.nextDouble();
            double subject3 = input.nextDouble();
            double subject4 = input.nextDouble();

            
            double average = (subject1 + subject2 + subject3 + subject4) / 4;

         
            System.out.println("Average is : " + average);

            if (average >= 75 && average <= 100) {
                System.out.println("Overall Grade is : Distinction");
            } else if (average >= 50 && average < 75) {
                System.out.println("Overall Grade is : Credit");
            } else if (average >= 0 && average < 50) {
                System.out.println("Overall Grade is : Fail");
            } else {
                System.out.println("Invalid marks entered.");
            }

            System.out.println();  
        }

        
    }
}
