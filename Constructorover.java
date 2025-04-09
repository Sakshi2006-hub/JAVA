class Constructorover
{
 int id;
 String name;
 int age;
 Constructorover(int i,String n)
 {
  id=i;
  name=n;
  }
 Constructorover(int i,String n,int a)
 {
  id=i;
  name=n;
  age=a;
  }
  void display()
  {
  System.out.println(id +" "+ name +" "+ age);
  }
 
 public static void main(String args[])
 {
  Constructorover c=new Constructorover(1,"sakshi");
  Constructorover c1=new Constructorover(2,"sakshi",20);
  c.display();
  c1.display();
 }
}
  
