import java.util.*;
class Concat

{
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String name=sc.nextLine();
	
	if(name.length()>=3)
	{
		System.out.println("Hello "+name+" ,How are you?");
	}

	else
	{
		System.out.println("name should be minimum of three charactors");
	}
}
}
