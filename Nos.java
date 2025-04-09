import java.util.*;
class Nos
{
  public static void main(String args[])
  {
    int i=1,a=3,b=4,add;
    do
    {
     add=a+b;
     System.out.println(a+"\t"+b+"\t"+add);
     a=add;
     b++;
     i++;
    }while(i<=5);
   }
 } 
