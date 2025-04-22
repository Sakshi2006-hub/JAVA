hhimport java.io.IOException;
class throwsException
{
	void m() throws IOException
	{
		throw new IOException("Exception caught");
	}
	void n() throws IOException
	{
		m();
	}
	void p()
	{
		try
		{
			n();
		}
		catch(Exception e)
		{
			System.out.println("Exception handled");
		}
	}
	public static void main(String args[])
	{
		throwsException obj=new throwsException();
		obj.p();
		System.out.println("Executed");
	}
}
	
