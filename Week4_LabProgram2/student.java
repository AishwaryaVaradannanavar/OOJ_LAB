import java.util.Scanner;
class student
{
	String name;
	String usn;
	int sum=0,n;
	double sgpa;
	int[] credits,score;
	double[] marks;
	 
	void getdata()
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("enter name, usn, no. of subjects");
		name=ss.next();
		usn=ss.next();
		n=ss.nextInt();
		credits=new int[n];
		marks=new double[n];
		score=new int[n];
		int i;
		for(i=0;i<n;i++)
		{
			System.out.println("enter credits and marks for subject"+ (i+1));
	        credits[i]=ss.nextInt();
			
			marks[i]=ss.nextDouble();
			if(marks[i]>=90)
				score[i]=10;
			else if(marks[i]>=80)
				score[i]=9;
			else if(marks[i]>=70)
				score[i]=8;
			else if(marks[i]>=60)
				score[i]=7;
			else if(marks[i]>=50)
				score[i]=6;
			else if(marks[i]>=40)
				score[i]=5;
			else score[i]=4;
			sum=sum+credits[i];
		}
	}
	void calc()
	{
		int i;
		double total=0.0;
		for(i=0;i<n;i++)
		{
			total=total+credits[i]*score[i];
		}
		sgpa=total/sum;
		
	}
	
	void printdata()
	{
		System.out.println("name= "+  name);
		System.out.println("usn= "+  usn);
		calc();
	    System.out.printf("sgpa is %.2f ", sgpa);
	}
}



class std
{
	public static void main(String args[])
	{
		student s1=new student();
		s1.getdata();
		s1.printdata();
		
	}
}
