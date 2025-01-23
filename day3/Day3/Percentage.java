//percentage

class Percentage

 {
    public static void main(String args[]) 
{
       	 // Total marks and marks obtained
       	 int totalMarks = 500;
       	 int marksObtained = 430;

       	 // Calculate percentage
       	 double percentage = (marksObtained / (double) 	totalMarks) * 100;

        // Print the result
        System.out.printf("The percentage is: %.2f%%", percentage);
    }
}