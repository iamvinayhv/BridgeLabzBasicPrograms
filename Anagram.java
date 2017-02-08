import java.util.*;
class Anagram
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter 1st String");
String st1=sc.next();

System.out.println("Enter 2st String");
String st2=sc.next();

st1=removeSp(st1);
st2=removeSp(st2);

if(st1.length()!=st2.length())
{
	System.out.println("Not a anagram Strings differ in charactor length");
	return;
}

st1=sort(st1);
st2=sort(st2);

char[]ch1=st1.toCharArray();
char[]ch2=st2.toCharArray();

for(int i=0;i<ch1.length;i++)
{
	if(ch1[i]!=ch2[i])
	{
	System.out.println("Strings are not a Anagram");
	return;
	}
}

System.out.println("Strings are Anagram");


}



static String removeSp(String st)
{
	char[]ch=st.toCharArray();
	st="";

	for(int i=0;i<ch.length;i++)
	{	
		if(ch[i]!=' ')
		st=st+ch[i];
	}
return st;
}

static String sort(String st)
{
	char[]ch=st.toCharArray();
	st="";

	for(int i=0;i<ch.length;i++)
	{
		for(int j=i;j<ch.length;j++)
		{
			if(ch[i]>ch[j])
			{
			char c=ch[i];
			ch[i]=ch[j];
			ch[j]=c;
			}
		}
	}
return new String(ch);
}

}
