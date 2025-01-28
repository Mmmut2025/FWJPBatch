import java.util.Scanner;

class OddOrEven

{
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);


				System.out.print("Enter a Number: ");
				
					int num = sc.nextInt();

				String result = (num % 2 == 0) ? "Even" : "Odd";
				System.out.println("The number is:" +result);
		}

		
 

}