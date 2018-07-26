class Con_with_para
{
void Team()
{
System.out.println("dhoni");
System.out.println("virat");
}
Con_with_para(int dscore,int vscore)
{
System.out.println("dhoni's score is"+dscore);
System.out.println("virat's score is"+vscore);
}
}
class Consp
{
public static void main(String arg[])
{
Con_with_para obj=new Con_with_para(67,89);
obj.Team();
}
}
