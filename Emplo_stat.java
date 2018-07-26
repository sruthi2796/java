import java.util.*;
class Emplo_stat
{
int eid;
String name;
static String address;
void get()
{
Scanner scan=new Scanner(System.in);
System.out.println("enter eid");
eid=scan.nextInt();
System.out.println("enter name");
name=scan.next();
System.out.println("enter add");
address=scan.next();
}
void display()
{
System.out.println("print eid"+eid);
System.out.println("enter name"+name);
System.out.println("enter address"+address);
}
}
class Main_stat
{
public static void main(String arg[])
{
Emplo_stat obj1=new Emplo_stat();
Emplo_stat obj2=new Emplo_stat();
obj1.get();
obj1.display();
obj2.get();
obj2.display();
}
}




