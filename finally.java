class arrayoutofbound
{
	public static void main(String args[])
	{
		try
		{
			int[]a={1,2,3,4};
			for(i=0;i<3;i++)
			{
				System.out.println(a[i]);
			}
		}
		catch(Exception e)
		{
			System.out.println("Array out of bound exception");
		}
		finally
		{
			System.out.println("A try catch block is finished");
		}
	}
}
