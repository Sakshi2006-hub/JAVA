class Overloading
{
  int add(int a,int b)
  {
    return a+b;
  }
   double add(double a,double b)
  {
    return a+b;
   }
   public static void main(String args[])
   {
     Overloading o=new Overloading();
     int a=o.add(10,20);
     System.out.println("addition of integer no is"+a);
     double b=o.add(10.2,11.3);
     System.out.println("addition of double no is"+b);
    }
 }
