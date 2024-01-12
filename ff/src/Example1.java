import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example1
{
    public  static void main(String[] args )
    {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        String myStr1 = str1.substring(1,str1.length()-1);
        String myStr2 = str2.substring(1,str1.length()-1);

        String[] arr1 = myStr1.split(",");
        String[] arr2 = myStr2.split(",");

        List<String> mylist = new ArrayList<>();
        List<String> myList1 = new ArrayList<>();

        for(int i=0;i<arr1.length;i++)
        {
            String[] temp = arr1[i].split(":");
            for(int j=0;j< temp.length;j++)
            {
                String t = temp[j];
                String t1 = t.substring(1,t.length()-1);
                mylist.add(t1);
            }
        }

        for(int i=0;i<arr2.length;i++)
        {
            String[] temp = arr2[i].split(":");
            for(int j=0;j< temp.length;j++)
            {
                String t = temp[j];
                String t1 = t.substring(1,t.length()-1);
                myList1.add(t1);
            }
        }
        List<String> result = new ArrayList<>();

        for(int k =0;k< mylist.size();k++)
        {
            if(mylist.get(k).equals(myList1.get(k)))
            {
                result.add(myList1.get(k));
            }
        }

        System.out.println(result);
    }
}
