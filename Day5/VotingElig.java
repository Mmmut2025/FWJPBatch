import java.util.Scanner;

class VotingElig
{
		public static void main(String args[])

	{ 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age : ");

		int age = sc.nextInt();

		String result = (age >= 18)  ? "You are eligible to vote." : "You are not eligible to vote.";

		System.out.println(result);
	
	
	}




}