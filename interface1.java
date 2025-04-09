interface Drawable
{
  void draw();
}
class Rectangle implements Drawable
{
  public void draw()
  {
   System.out.println("Rectangle ");
  }
}
class circle implements Drawable
{
  public void draw()
  {
   System.out.println("circle");
   }
}
class interface1
{
 public static void main(String args[])
 {
  Drawable=new circle();
  d.draw();
  }
}
