import java.util.Scanner;
abstract class shape
{
	int a,b;
	abstract void printarea();
}
class rectangle extends shape
{
	void printarea()
	{
		Scanner sc= new Scanner(System.in);
        System.out.println("Enter the sides of the rectangle");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("The area of the rectangle= "+(a*b));
	}
}
class triangle extends shape
{
	void printarea()
	{
		Scanner sc= new Scanner(System.in);
        System.out.println("Enter the height and base of the triangle");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("The area of the triangle= "+((float)a*b/2));
	}
}
class circle extends shape
{
	void printarea()
	{
		Scanner sc= new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
		a=sc.nextInt();
		
		System.out.println("The area of the circle= "+(3.14*a*a));
	}
}
class shapes
{
	public static void main(String args[])
	{
		rectangle r=new rectangle();
		r.printarea();
		triangle t=new triangle();
		t.printarea();
		circle c=new circle();
		c.printarea();
	}
}
