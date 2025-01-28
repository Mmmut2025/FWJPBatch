import java.util.Scanner;

class StudentDemo

{
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);


				System.out.print("Enter a Marks: ");
				
					int marks = sc.nextInt();

				String result = (marks >= 40) ? "Pass" : "Fail";
				System.out.println("The result is:" +result);
		}

		
 

}

