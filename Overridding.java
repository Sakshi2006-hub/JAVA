import java.util.*;
class A
{
 void display()
 {
  System.out.println("hii I am super class");
 }
}
class B extends A
{
 void display()
 {
  super.display();
  System.out.println("derived class1");  
 }
}
class Overridding
{  
 public static void main(String args[])
 {
	 B b=new B();
	 b.display();
 }
} 
