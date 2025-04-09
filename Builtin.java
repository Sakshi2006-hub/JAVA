import java.math.*;
class Builtin
{
	public static void main(String args[])
	{
		int a=2,b=5;
		double e=10.4;
		double c=Math.pow(a,b);
		System.out.println("power is"+c);
		double d=Math.sqrt(b);
		System.out.println("square root is"+d);
		System.out.println("minimum is"+(Math.min(a,b)));
		System.out.println("maximum is"+(Math.max(a,b)));
		System.out.println("absoulte is"+(Math.abs(a)));
		System.out.println("floor is"+(Math.floor(e)));
		System.out.println("ceil is"+(Math.ceil(e)));
	 }
}
