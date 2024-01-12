import java.util.*;
import java.lang.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Test case: ");
        int T = sc.nextInt();
        while(T-->0)
        {
            System.out.println("Enter the size of the array: ");
            int n = sc.nextInt();

            System.out.println("Element of the arrays: ");
            int arr[] = new int[n];
            for (int i = 0; i<n; i++)
            {
                arr[i]= sc.nextInt();
            }

            int max = arr[0]+arr[n-1];

            for(int i=n-1;i>0;i--)
            {
                int temp = arr[i]+arr[i-1];
                if(max<temp)
                {
                    max = temp;
                }
            }

            System.out.println(max);
        }
    }
}
