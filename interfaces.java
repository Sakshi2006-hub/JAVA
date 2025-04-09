interface cal
{
void c(int item);
}
class display implements cal
{
int x;
public void c(int item)
{
x=item*item;
}
}
class interfaces
{
public static void main(String args[])
{
display arr=new display();
arr.x=0;
arr.c(2);
System.out.print(arr.x);
}
}
