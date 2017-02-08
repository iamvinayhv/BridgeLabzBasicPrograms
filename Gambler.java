import java.util.Scanner;
class Gambler
{
static double win=0;
static double loss=0;
static int  trails;
static int stack;
static int Goal;

public static void main(String[]args)
{

	Scanner sc =new Scanner(System.in);
	System.out.println("Enter how much stack you have");
	stack =sc.nextInt();

	System.out.println("Whats your Goal");
	Goal=sc.nextInt();


	System.out.println("Enter your number of Trails");
	trails=sc.nextInt();

	play(trails);
}


static void play(double t)
{
	double i=1;

	while(i<=t &&stack>0 &&stack<=Goal)
	{
	double d=Math.random();

	if(d<0.5)
	{
	loss++;
	stack--;
	}
	else if(d>=0.5)
	{
	win++;
	stack++;
	}
	i++;

	}


	System.out.println("winning chance is ="+(win/trails)*100+" %");
	System.out.println("lose chance is ="+(loss/trails)*100+" %");


	System.out.println("your current stack is "+stack);

}

}
