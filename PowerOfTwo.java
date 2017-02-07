class PowerOfTwo
{
	public static void main(String[]args)
	{
		
		int n=Integer.parseInt(args[0]);

		for(int i=0;i<31;i++)
		{
			int res=pow(n,i);
			System.out.println(n+"^"+i+" = "+res); 
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
