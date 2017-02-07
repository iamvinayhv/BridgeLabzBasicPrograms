import java.util.*;
class PrimeFactor
{
public static void main (String[]args)
{
	Scanner sc =new Scanner (System.in);
	System.out.println("Enter the Number");
	int num=sc.nextInt();
	

	for (int i=1;i<=num;i++)  	   
	{		 		  
         int counter=0; 		  
         for(int j=2;j<=num;j++)
         {
	    if(i%j==0)
	    {
		counter++;
	    }
	 }
	 if (counter ==1)
	 {
	    if(num%i==0)
		System.out.println(i);
	 }
	}
}
}
