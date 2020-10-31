import java.util.Scanner;
class actor
{
String id,name;
int movies,years;

float calc()
{
	
	float avg=(float)movies/years;
	return avg;
}
}
class actors
{
	public static void main(String args[])
	{
		
		Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of actors ");
		int n=sc.nextInt();
		actor a[]=new actor[n];
		int i;
		float b[]=new float[n];
		for(i=0;i<n;i++)
		{
			a[i]=new actor();
			System.out.println("enter the name,id,movies done and years of experience of actor "+(i+1));
			a[i].name=sc.next();
			a[i].id=sc.next();
			a[i].movies=sc.nextInt();
			a[i].years=sc.nextInt();
			b[i]=a[i].calc();
		}
		float high=b[0];
		int j=0;
		for(i=0;i<n;i++)
		{
			if(b[i]>high)
			{
				high=b[i];
				j=i;
			}
		}
		System.out.println("the actor having highest average=  "+a[j].name);
		
		
		
	}
}
		
	
