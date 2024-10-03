import java.util.Scanner;
 public class IT24100576Lab7Q1A{
 public static void main(String[]args){

Scanner input = new Scanner(System.in);

  
System.out.println("Enter marks for four subjects:");

System.out.println("Enter Subject Mark 1:");
double mark1=input.nextDouble();
  
System.out.println("Enter Subject Mark 2:");
double mark2=input.nextDouble();

System.out.println("Enter Subject Mark 3:");
double mark3=input.nextDouble();
      
System.out.println("Enter Subject Mark 4:");
double mark4=input.nextDouble();
  
  Double avg= mark1 + mark2 + mark3 + mark4/4;

System.out.println("Average is" + " " + ":" + avg);

 if(avg >= 75 && avg <= 100) {
System.out.println("Overall Grade is : Distinction");}


  else if(avg >= 50 && avg <= 74) {
System.out.println("Overall Grade is : Credit");}

 else if(avg >= 0 && avg <= 49) {
System.out.println("Overall Grade is : Fail");}

 else {
System.out.println("Overall Grade is : Invalid");}

   }
}


