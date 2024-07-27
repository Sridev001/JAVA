abstract class A
{
abstract void display();
}
class B extends A
{
void display()
{System.out.println("class B");}
}

class C extends A
{
void display()
{System.out.println("class C");}
}

public class Abstract
{
public static void main(String args[])
{
A obj = new B();
obj.display();
obj = new C();
obj.display();
}
}