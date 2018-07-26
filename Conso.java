class Cons_over
{
Cons_over()
{
System.out.println("dhoni");
System.out.println("virat");
}
Cons_over(int dscore,int vscore)
{
System.out.println("dhoni's score is"+dscore);
System.out.println("virat's score is"+vscore);
}
Cons_over(float dscore)
{
System.out.println("virat is the best player "+dscore);
}
}
class Conso
{
public static void main(String arg[])
{
new Cons_over();
new Cons_over(98.2f);
new Cons_over(67,98);
}
}