import java .util.*;
public class Armstrongno
{
     public static void main(String args[])
     {
			int n=153,dig,sum=0,i;
			i=n;
			while(n>0)
			{
				dig=n%10;
				sum=sum+(dig*dig*dig);
				n=n/10;
			}
			if(i==sum)
			{
			   System.out.println("no is armstrong");
			}
			else
			{
			   System.out.println("no is not armstrong");
		   }
      }
}

