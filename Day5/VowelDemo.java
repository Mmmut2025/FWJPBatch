import java.util.Scanner;

class VowelDemo

{

			public static void main(String args[])
	
		{
			Scanner  sc = new Scanner(System.in);
			System.out.print("Enter a character: ");

			char ch = sc.next().toLowerCase().charAt(0);

			String result = (ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u') ? "Vowel" : "Not Vowel";

  			System.out.println("The  Character is :" +result);
		
		}


}