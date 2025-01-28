import java.util.Scanner;

class NumberDemo

{
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);


				System.out.print("Enter a Number: ");
				
					int num = sc.nextInt();

				String result = (num > 0) ? "Positivs" : (num < 0) ? "Negativa" : "Zero";
				System.out.println("The number is:" +result);
		}

		
 

}