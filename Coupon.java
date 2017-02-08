import java.util.*;
class Coupon
{
public static void main(String[]args)
{

Scanner sc =new Scanner(System.in);
System.out.println("Enter how many Coupons u want");
int num=sc.nextInt();
int n=2*num;

int[]cop=new int[n];

for(int i =0; i<n; i++)
{
	cop[i] = (int)(100.0 * Math.random());
}

//disp(cop,n);

for(int i=0;i<n;i++)
{
	for(int j=i+1;j<n;j++)
	{
		if(cop[i]==cop[j])
		{
			int k=j;
			while(k<n-1)
			{
			cop[k]=cop[k+1];
			k++;
			}
		j--;
		n--;
		}
	}
}

disp(cop,num);

}


static void disp(int []ar,int n)
{
	for(int i=0;i<n;i++)
	{
		System.out.println(i+" : "+ar[i]);
	}
}


}
