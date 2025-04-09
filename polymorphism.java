import java.util.*;
class A
	{  
		void display()
		{	
			System.out.println("this is base class");
		 }
	}
class B extends A
	{
		void display(int a,int b)
		{	
		   int add=a+b;
			System.out.println("addition is" +add);
		}
		void display()
		{
			super.display();
			int c=3,d=2;
		   int sub=c-d;
			System.out.println("subtraction is" +sub);
		}
	}
class polymorphism
	{
		public static void main(String args[])
		{
			B b=new B();
			b.display(1,2);
			b.display();
		}
	}		
		

		
