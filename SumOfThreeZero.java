import java.util.Scanner;
class SumOfThreeZero
{
public static void main(String[]args)
{
Scanner sc =new Scanner(System.in);

System.out.println("HOw many integers u want to enter");
int n=sc.nextInt();

int []arr=new int[n];

System.out.println("Enter your "+n+" values");

for(int i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}


for(int i=0;i<arr.length;i++)
{
int res=0;
for(int j=0;j<arr.length;j=j+2)
{
int c=0;
for(int k=0;k<arr.length;k=k+3)
{
	if(arr[i]+arr[j]+arr[k]==0)
	System.out.println("Sum of these triplets is Zero "+arr[i]+","+arr[j]+","+arr[k]);
}
}
}






}
}
