import java.util.Scanner;
class circledemo
{
static float radius,area,peri,pi=(float)3.14;
static void accept()
{
	Scanner sc= new Scanner(System.in);
System.out.println("enter the radius ");
radius=sc.nextFloat();
}
static void area()
{
	area=pi*radius*radius;
}
static void perimeter()
{
	peri=2*pi*radius;
}
static void display()
{
	System.out.println("radius= "+radius);
	System.out.println("area= "+area);
	System.out.println("perimeter= "+peri);
}
public static void main(String[] args)
{
	accept();
	area();
	perimeter();
	display();
	
}
}
	
