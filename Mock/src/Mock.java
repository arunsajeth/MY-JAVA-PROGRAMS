import java.util.HashSet;
import java.util.Scanner;

public class Mock
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("array size:");
        int n = sc.nextInt();

        System.out.println("Key:");
        int k = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Elements of the array are");
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }

        int count =0;

        for(int i=0;i<n-k+1;i++)
        {
            HashSet<Integer> set = new HashSet<>();
            int m = i+k;
            for(int j=i;j<m;j++)
            {
                set.add(arr[j]);
            }
            System.out.println(set);
            if(count< set.size())
            {
                count= set.size();
            }

        }

        System.out.println(count);

    }
}
