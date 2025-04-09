abstract class demo
{ 
   abstract svoid display();
}
class Abstract extends demo
{
	  public void display()
	  {
		 System.out.println("hi i am abstract class");
	  }
		public static void main(String args[])
		{
		  Abstract A=new Abstract();
		  A.display();
		 }
}
