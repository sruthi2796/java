import java.util.*;
class Emplo_sblock
{
int eid;
static String name="sru";
static String address="niit";
static
{
Emplo_sblock obj=new Emplo_sblock();           
Scanner scan=new Scanner(System.in);
System.out.println("enter eid");
obj.eid=scan.nextInt();
//}
//void disp() 
//{          
System.out.println("print eid"+obj.eid);
System.out.println("print name"+name);
System.out.println("print address"+address);
}
public static void main(String arg[])
{
//Emplo_sblock obj1=new Emplo_sblock();
//Emplo_sblock obj2=new Emplo_sblock();
//obj1.disp();
//obj2.disp();
}
}