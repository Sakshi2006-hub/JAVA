import java.util.*;
import java.lang.Throwable;
class arrayoutofbound
{
	public static void main(String args[])
	{
		try
		{
			int[]a={1,2,3,4};
			for(int i=0;i<6;i++)
			{
				System.out.println(a[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array out of bound exception"+e.getMessage());
		}
		finally
		{
			System.out.println("A try catch block is finished");
		}
	}
}
