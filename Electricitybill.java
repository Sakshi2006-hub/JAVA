public class Electricitybill
{
public static void main(String args[])
{
int unit=200,bill;
if(unit<=100)
{
bill=unit*4;
System.out.println("bill is"+bill);
}
else if(unit>100)
{
bill=unit*5;
System.out.println("bill is"+bill);
}
else if(unit>200)
{
bill=unit*6;
System.out.println("bill is"+bill);
}
}
}

