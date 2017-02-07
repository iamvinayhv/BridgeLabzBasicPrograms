import java.util.*;
class MyDequeMain
{
	public static void  main(String[]args)
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter to check palindrome or not");
		
		String st=sc.next();


		char[]ch=st.toCharArray();

		int n=ch.length-1;

		
		MyDeque m=new MyDeque(10);

		for(int i=0;i<ch.length;i++)
		{
			m.addFront(ch[i]);
		}

		int s=m.size();
		System.out.println("Size= "+s);

		String Sout="";

		for(int i=0;i<=n;i++)
		{
			char c=m.removeFront();
			Sout=Sout+c;
		}
		System.out.println("Reversed - "+Sout);
		if(st.equals(Sout))
		{
			System.out.println("Palindrome ");
		}
		else
		{
			System.out.println("not a palindrome ");
		}

	}
}
		
