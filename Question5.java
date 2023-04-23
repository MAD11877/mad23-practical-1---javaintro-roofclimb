import java.util.Scanner;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
    
    ArrayList<Integer> data = new ArrayList<>();
    
    Scanner in = new Scanner(System.in);
    //System.out.print("How many numbers? ");
    int integer = in.nextInt();
    int list[]=new int[integer];
    int max = 0;
    int count=1;
    int mode=0;
    for(int i=0; i<integer; i++)
    {
      //System.out.print("Enter an integer: ");
      int n = in.nextInt();
      data.add(n);
    }
    for(int i=0; i<integer; i++)
    {
        for(int n=i+1; n<integer; n++)
        {
            if(data.get(i)==data.get(n))
            {
                count+=1;
                if(count>max)
                {
                    mode=data.get(i);
                }
            }
        }
        count=1;
        
      //System.out.print(data.get(i));
    }
    System.out.print(mode);
  }
}
