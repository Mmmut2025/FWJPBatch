import java.util.Scanner;

class LeapYear 
{

    public static void main(String args[]) 
 {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        String result = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? "is a leap year" : "is not a leap year";

        System.out.println("Result: " + result);
    }
}