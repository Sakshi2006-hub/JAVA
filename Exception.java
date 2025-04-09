public class Exception
{
	public static void checkage(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Access denied:age must be greater than 18");
		}
		else
		{
			throw new ArithmeticException("Access granted");
		}
	}
public static void main(String args[])
{	
	Exception obj=new Exception();
	obj.checkage(16);
}
}
		
