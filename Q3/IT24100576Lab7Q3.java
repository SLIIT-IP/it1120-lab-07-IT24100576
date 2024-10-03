import java.util.Scanner;
public class IT24100576Lab7Q3{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        for (int i=1; i<=5; i++){
            System.out.println("Customer"+i);
            System.out.print("Enter total bill amount: ");
            double totAmount = sc.nextDouble();
            System.out.print("Enter mode of payment (C for cash, O for other): ");
            char payMode = sc.next().charAt(0);

            if (payMode == 'C'|| payMode == 'c'){
                double discount = totAmount*5/100;
                double payAmount = totAmount - discount;
                System.out.println("Discount is : "+discount);
                System.out.println("Amount to be paid : "+payAmount);
                System.out.print("\n");
            }
            else if (payMode == 'O'|| payMode == 'o'){
                System.out.println("No discount applicable");
                System.out.println("Amount to be paid : "+totAmount);
                System.out.print("\n");
            }
            else {
                System.out.println("Payment Mode is Not Valid");
                System.out.print("\n");
            }
        }
        
        
    }
}