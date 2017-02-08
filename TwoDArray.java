import java.util.*;
class TwoDArray
{
public static void main(String[]args)
{

Scanner sc =new Scanner(System.in);

System.out.println();
System.out.println("which values u want to store");
System.out.println("Press 1 for Integer type of values");
System.out.println("Press 2 for Double type of values");
System.out.println("Press 3 for Boolean  type of values");

int t=sc.nextInt();


System.out.println("Enter Order of the matrix");
int r=sc.nextInt();
int c=sc.nextInt();



System.out.println("Enter "+r*c+" values");


if(t==1)
{
int[][]arr=new int[r][c];

for(int i=0;i<arr.length;i++)
{
	for(int j=0;j<arr[i].length;j++)
	{
		arr[i][j]=sc.nextInt();
	}
}

disp(arr);

}




if(t==2)
{
double[][]arr=new double[r][c];

for(int i=0;i<arr.length;i++)
{
	for(int j=0;j<arr[i].length;j++)
	{
		arr[i][j]=Double.parseDouble(sc.next());
	}
}

	for(int i=0;i<arr.length;i++)
	{
	for(int j=0;j<arr[i].length;j++)
	{
		System.out.print(arr[i][j]+" ");
	}

	System.out.println();
	}
}



if(t==3)
{

boolean [][]arrb=new boolean[r][c];

for(int i=0;i<arrb.length;i++)
{
	for(int j=0;j<arrb[i].length;j++)
	{
		String b=sc.next();
		if(b.equals("0"))
		arrb[i][j]=false;
		else if(b.equals("1"))
		arrb[i][j]=true;
		else
		arrb[i][j]=Boolean.parseBoolean(b);

	}
}

for(int i=0;i<arrb.length;i++)
{
	for(int j=0;j<arrb[i].length;j++)
	{
		System.out.print(arrb[i][j]+" ");
	}

	System.out.println();
}
}


}



static void disp(int[][]ar)
{

for(int i=0;i<ar.length;i++)
{
	for(int j=0;j<ar[i].length;j++)
	{
		System.out.print(ar[i][j]+" ");
	}

	System.out.println();
}



}
}

/*for(int j=0;j<arrb[i].length;j++)
	{
		arrb[i][j]=Boolean.parseBoolean(sc.next());
	}
*/
