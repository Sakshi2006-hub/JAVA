import java .util.*;
public class Palindrome
{
public static void main(String args[])
{
int n=153,dig,sum=0,i;
i=n;
while(n>0)
{
dig=n%10;
sum=(sum*10)+dig;
n=n/10;
}
System.out.println("sum of digit"+sum);
if(i==sum)
{
System.out.println("no is palindrome");
}
else
{
System.out.println("no is not palindrome");
}
}
}

