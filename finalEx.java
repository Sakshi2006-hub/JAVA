import java.util.*;
class finalEx
{
	public static void main(String args[])
	{
		try
		{
			int[] myno={1,2,3};
			System.out.println(myno[5]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("exception occur");
		}
		finally
		{
			System.out.println("A try catch block is finished");
		}
	}
}
