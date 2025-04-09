interface printable
{
 void print();
}
class print1
{
  void print()
   {
    System.out.println("abstract class");
   }
    public static void main(String args[])
    {
       print1 p=new print1();
       p.print();
     }
}
