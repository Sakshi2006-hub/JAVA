 abstract class A
{
   abstract void display();
   abstract void calculate();
}
class B extends A
{
  int a,b,c;
  void calculate()
  {                
     a=10;
        sb=2;
   }
   void addition()
   {
     
     c=a+b;
   }
   void display()
   { 
     System.out.println("addition is");
     System.out.println(c);
   }
   public static void main(String args[])
   {
     B b=new B();
     b.calculate();
     b.addition();  
     b.display();
    }
}  
