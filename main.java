class parent
{
public void print()
{
System.out.println("parent");
}
}
class child extends parent
{
public void print()
{
System.out.println("child");
super.print();
}
}
public class main
{
public static void main(String args[])
{
child c=new child();
c.print();
}
}
