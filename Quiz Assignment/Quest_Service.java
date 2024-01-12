package quiz;
import java.util.*;

public class Quest_Service
{
	static Scanner sc = new Scanner(System.in);

	static Quiz[] quiz_choice = new Quiz[10];
	static int mark=0;
	static int size=0;

	public static void choiceGetting()
	{
		System.out.print("Enter the anwer: ");
		quiz_choice[size].new Quiz(sc.nextLine());
		
		crct_Answer();
		size+=1;		
	}
	
	public static void crct_Answer()
	{
		String quiz_ans[]={"8","32 and 64","Objects","At run time","void","Package is collection of class and interface","java.lang.Object","An int value","13","static"};
		
		if(quiz_choice[size].getChoice().equals(quiz_ans[size]))
		{
			mark+=1;
			System.out.println("Choice is correct");
		}
		else
		{
			System.out.println("Correct Answer is:"+quiz_ans[size]);
		}
	}
	
	public static void markDisplay()
	{
		System.out.println("Your score is "+mark+" out of 10.");
	}

}