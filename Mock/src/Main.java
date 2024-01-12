import java.util.HashMap;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        HashMap<Character, Integer> map1 = new HashMap<>();
        StringBuffer result = new StringBuffer();

        for(int i=0;i<str2.length();i++)
        {
            if(map1.containsKey(str2.charAt(i)))
            {
                map1.put(str2.charAt(i), map1.get(str2.charAt(i))+1);
            }
            else
            {
                map1.put(str2.charAt(i), 1);
            }
        }

        for(int i=0;i<str1.length();i++)
        {
            char c = str1.charAt(i);
            if(map1.containsKey(c) && map1.get(c)>=1)
            {
                result.append(c);
                map1.put(c, map1.get(c)-1);
            }
        }

        System.out.println(result);
    }
}