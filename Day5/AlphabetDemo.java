import java.util.Scanner;


class AlphabetDemo

	{	
		public static void main(String args[])

		{
			Scanner sc = new Scanner(System.in);

			System.out.print("Enter a character: ");

			char ch = sc.next().charAt(0);

			String result = (ch >= 'A' && ch <= 'Z') ? "Uppercase" : (ch >= 'a' && ch <= 'z') ? "Lowercase" : "Not an alphabet";

			System.out.println("The character is:" +result);
		
		}
	
	}





