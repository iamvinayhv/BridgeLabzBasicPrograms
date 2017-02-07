class MyDeque
{
private int front;
private int rare;
private int maxSize;
private char[]Qarray;

MyDeque(int n)
{
	maxSize=n;
	front =-1;
	rare=-1;
	Qarray=new char[maxSize-1];
}

public void addFront(char c)
{
	for(int i=rare+1;i>0;i--)
	{
		Qarray[i]=Qarray[i-1];
	}

	++rare;
	Qarray[0]=c;
}

public void addRare(char c)
{
	++rare;
	Qarray[rare]=c;
}

public char removeFront()
{
	char c=Qarray[0];

	for(int i=0;i<=rare;i++)
		{
			Qarray[i]=Qarray[i+1];
		}
	rare--;
	return c;
}

public char removeRare()
{
	char c=Qarray[rare];
	rare--;

	return c;

}

public int size()
{
	return rare+1;
}

}
