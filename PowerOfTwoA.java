// up to the perticular number
class PowerOfTwoA
{
	public static void main(String[]args)
	{
		
		int n=Integer.parseInt(args[0]);
		if(n>=1&&n<31)
		{
		for(int i=0;i<n;i++)
		{
			int res=pow(2,i);
			System.out.println("2^"+i+" = "+res); 
		}
		}
		
		
	}
	
	static int pow(int num,int c)
	{
		int p=1;
		while(c>0)
		{
			p=p*num;
			c--;
		}
		return p;
	}
		
}
