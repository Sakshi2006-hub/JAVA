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
 void display1()
 {
  System.out.println("hii i am sub class");
 }
}
class C extends B
{
 void display2()
 {
  System.out.println("hi i am child class");
 }
}
class Multilevel
{
 public static void main(String args[])
 {
  C obj=new C();
  obj.display();
  obj.display1();
  obj.display2();
 }
}
