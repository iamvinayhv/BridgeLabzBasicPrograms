import java.util.*;
class BubbleSort
{
public static void main(String[]args)
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter the size");
int size=sc.nextInt();
int[]arr=new int[size];

System.out.println("Enter "+size+" elements of array");

for(int i=0;i<size;i++)
{
arr[i]=sc.nextInt();
}


for(int i=0;i<arr.length;i++)
{
for(int j=i+1;j<arr.length;j++)
{
if(arr[i]>arr[j])
{
int t=arr[i];
arr[i]=arr[j];
arr[j]=t;
}
}
}

System.out.println("After sorting");

for(int i=0;i<arr.length;i++)
{
System.out.print(arr[i]+",");
}
System.out.println();


}
}
