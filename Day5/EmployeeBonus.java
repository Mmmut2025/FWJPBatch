import java.util.Scanner;

class EmployeeBonus 
{

    public static void main(String args[]) 
	{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee experience (in years): ");
        int experience = scanner.nextInt();

        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();

        double bonus = (experience > 20) ? 0.2 * salary : 0.1 * salary;

        System.out.println("Employee bonus: " +bonus);

        scanner.close();
    }
}