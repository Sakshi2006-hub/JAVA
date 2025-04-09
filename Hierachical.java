import java.util.*;
class A
{
 void display1()
 {
  System.out.println("hii I am super class");
 }
}
class B extends A
{
 void display()
 {
  System.out.println("derived class1");
  
  }
 }
class C extends A
{
 void display()
 {
  System.out.println("derived class2");
  }
}
class Hierachical
{
 public static void main(String args[])
 {
  B b=new B();
  b.display1 A();
  b.display();
  C c=new C();
  c.display();
 }
}
