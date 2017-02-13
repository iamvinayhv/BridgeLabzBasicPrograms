import java.util.Scanner;
class MyStopWatch extends Thread
{
public static void main(String[]args)
{

Scanner sc=new Scanner(System.in);
System.out.println("Press \"S\" for start");
String s=sc.next();

char cs=s.charAt(0);

if(cs=='s')
{

int i=0;
int k=0;
int c=0;


for(i=0;i<1000;i++)
{
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
System.out.print("Inturupt"); 
}
System.out.print(c+":"+i%60+":");

for(k=0;k<10;k++)
{
try
{
Thread.sleep(10);
}
catch(Exception e)
{
System.out.print("Inturupt"); 
}
System.out.print(k%10);

}
System.out.println();

if(i==59||i==119||i==179||i==239||i==299||359||419)
{
c++;
}


}
try{}
finally
{
System.out.println("Time taken = "+c+":"+i+":"+k);
}

}

else
System.out.println("Try onece again!!!");

}
}
