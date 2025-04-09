class base
{
public void show()
{
System.out.println("base::show() called");+
}
}
class derived extends base
[
public void show()
{
System.out.println("derived::show() called");
}
}
public class main1
{
public static void main(String args[])
{
base b=new derived();;
b.show();
}
}
