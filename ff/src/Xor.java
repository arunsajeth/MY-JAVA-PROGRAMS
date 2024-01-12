import java.util.Scanner;

public class Xor
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }

        int result =0;
        for(int i =0; i<n-1;i++)
        {
            for(int j =i+1; j<n;j++)
            {
                int xor = (arr[i] | arr[j]) & (~arr[i] | ~arr[j]);
                if((2*xor) == (arr[i]+ arr[j]))
                {
                    result++;
                }
            }
        }

        System.out.println(result);
    }
}
