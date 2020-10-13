  
import java.util.Scanner;

class quadratic
{
	public static void main(String [] arg)
	{
		double first=0,second=0,root=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double det=(b*b)-(4*a*c);
		
		if (det>0)
		{
			first=(-b+Math.sqrt(det))/(2*a);
			second=(-b-Math.sqrt(det))/(2*a);
			System.out.printf("roots are real and distinct: %.2f and %.2f",first, second);
		}
		else if(det==0)
		{
			root=-b/(2*a);
			System.out.printf("roots are real and equal: %.2f and %.2f",root,root);
		}
		else if(det<0)
			System.out.println("real roots dont exist");
	}	
}
