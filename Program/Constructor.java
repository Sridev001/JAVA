public class DefaultConstructor
{
public static void main(String args[])
{
Cse obj1 = new Cse();

obj1.display();

Cse obj2 = new Cse(101,"Roy");

obj2.display();

//Cse obj3 = new Cse(obj1);

//obj3.display();
}
}

class Cse
{
int regno;
String name;

public Cse()
{
regno=100;
name="sridev";
}

public Cse(int register, String student)
{
regno = register;
name = student;
}

//public Cse(Cse obj3)
//{
//regno=obj3.registerno;
//name=obj3.student;
//}

public void display()
{
System.out.println(regno);
System.out.println(name);
}
}