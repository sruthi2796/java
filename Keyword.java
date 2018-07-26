class Keyword
{
int dscore,vscore;
void fun(int dscore,int vscore)
{
 this dscore=dscore;
 this vscore=vscore;
System.out.println("virat is the best player "+dscore);
System.out.println("virat is the best player "+vscore);
}
void disp()
{
System.out.println("virat is the best player "+dscore);
System.out.println("virat is the best player "+vscore);
}
public static void main(String arg[])
{
Keyword obj=new Keyword();
System.out.println("virat is the best player "+obj.vscore);
obj.fun(224,35);
obj.disp();
}
}