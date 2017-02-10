import java.util.Scanner;
class InsertionSort
{
	public static void main(String[] args){
    	System.out.println("Enter the total number of elements");
    	Scanner sc=new Scanner(System.in);
    	
    	
    	int n=sc.nextInt();
    	String[] arr=new String[n];
    	
    	System.out.println("Enter the elements need to be sort;");
    	
    	for(int i=0;i<arr.length;i++)
    	{
    		arr[i]=sc.next();
    	}

    	
    	for(int i=0;i<arr.length;i++)
    	{
    		for(int j=i;j>0;j--)
    		{
    			if(arr[j-1].compareTo(arr[j])>0)
    			{
    				String temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}

     	System.out.println("Sorted array elements are");
     	
     	for(int i=0;i<arr.length;i++) 
     	{
     		System.out.println(arr[i]);
        }
  }
}
