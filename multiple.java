interface A
{
  public void displayA();
}
interface B 
{
  public void displayB();
}
class multiple implements A,B
{
  public void displayB()
  {
    System.out.println("i am super class b");
   }
   public void displayA()
   { 
     System.out.println(" i am super class A");
   }
  public void display()
  {
    System.out.println("i am sub class multiple");
  }
public static void main(String args[])
 {
  multiple M=new multiple();
  M.displayA();
  M.displayB();
  M.display();
  }
}
