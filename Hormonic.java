import java.util.Scanner;
class Hormonic
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter which term of Hormonic is required");
		int n=sc.nextInt();
		double sum=0.00;

		for(double i=1;i<=n;i++)
		{
			sum=sum+(1/i);
		}
		
		System.out.println(n+"th Hormonic term is "+sum);

	}

}



