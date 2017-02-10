import java.util.*;
public class FindNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Steps u want");
		int steps=sc.nextInt();

		int result=1;
		int N;
		boolean check;
		
		for(int i=0;i<steps;i++)
		{
			result=result*2;
		}
		N=result;
		
		System.out.println("Pick one number between 0 to "+result);
		
		int first=1;
		int last=N/2;
		int i=2;
		int j=4;
		
		for(int k=0;k<steps;k++)
		{
			System.out.println("Your number is between "+first+" to "+last+"?? \n true or false");
			check=sc.nextBoolean();
			
			if(check)
			{
				N=N/2;
				last=last-((last-first+1)/2);
			}
			else
			{
				first=first+N/i;
				last=last+N/j;
				i=i+i;
				j=j+j;
			}
		}
		
		System.out.println("Is Your number is "+first+"?? \ntrue or false");
		check =sc.nextBoolean();
		
		if(check)
			System.out.println("Your number is: "+(first));
		else
			System.out.println("Your number is: "+(last+1));
		
		
	}

}
