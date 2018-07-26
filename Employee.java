class Employee
{
int avg;
int a=10,b=20,c=20500;
int total;
float average()
{
total=a+b+c;
avg=total/3;
System.out.println("the value is");
return avg;
}
public static void main(String avg[])
{
//int sum;
Employee obj=new Employee();
System.out.println(obj.avg);
System.out.println(obj.total);
float sum=obj.average();
System.out.println("the value is"+sum);
}
}
