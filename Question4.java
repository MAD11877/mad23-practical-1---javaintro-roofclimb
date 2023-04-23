import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    //System.out.print("Enter an integer: ");
    int y = in.nextInt();
    //System.out.print(y);
    for(int i=y; i>0; i--)
    {
        //System.out.print(i);
      for(int n=i; n>0; n--)
      {
        System.out.print("*");
        //System.out.print(n);
      }
       System.out.print("\n");
    }
  }
}
