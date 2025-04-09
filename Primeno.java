//import java.util.*;
public class Primeno
{
public static void main(String args[])
{
int n=100,i,flag=0;
for(i=2;i<n;i++)
{
if(n%i==0)
{
flag=1;
}
}
if(flag==1)
{
System.out.println("no is prime no");
}
else
{
System.out.println("no is not a prime no");
}
}
}




