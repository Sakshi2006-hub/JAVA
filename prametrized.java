class prametrized
{
 int id;
 String name;
 prametrized(int i,String n)
 {
  id=i;
  name=n;
  }
 void display()
  {
  System.out.println(id +" "+ name);
  }
 
 public static void main(String args[])
 {
  prametrized P=new prametrized(1,"sakshi");
  prametrized P1=new prametrized(2,"sakshi",20);
  P.display();
  P1.display();
 }
}
  
