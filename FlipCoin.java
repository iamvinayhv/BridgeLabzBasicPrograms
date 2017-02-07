import java.util.Scanner;
class FlipCoin
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter the number of times to flip");
int num=sc.nextInt();

flip(num);
}

static void flip(int num)
{
	double head=0.00;
	double tail=0.00;
	double random=0.00;
	
	for(int i=1;i<=num;i++)
	{
		random=Math.random();
		if(random<0.5)
			tail++;
		else
			head++;
	}

	System.out.println("Probability of getting Head "+(head/num)*100+" %");
	System.out.println("Probability of getting tail "+(tail/num)*100+" %");

}
}
