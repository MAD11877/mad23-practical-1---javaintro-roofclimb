import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
    
    System.out.print("Height: ");

    Scanner in = new Scanner(System.in);
    double height = in.nextDouble();

    System.out.print("Weight: ");
    double weight = in.nextDouble();

    double bmi=height*height/weight;
    System.out.println("BMI: "+bmi);
    }
}
