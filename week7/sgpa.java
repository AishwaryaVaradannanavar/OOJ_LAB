import java.util.Scanner;
class student
{
    String usn,name,sem;
	
    void readname()
    {
    
    Scanner ss=new Scanner(System.in);
    usn=ss.next();
    name=ss.next();
    sem=ss.next();
    }
}
class test extends student
{ 
    int n,i;
	double cie[];
	int credits[];
    void readmarks()
    {
    System.out.println("enter the number of courses");
    Scanner ss=new Scanner(System.in);
    n=ss.nextInt();
   
    cie=new double[n];
    credits=new int[n];
    System.out.println("enter the cie marks and corresponding credits");
    
    for(i=0;i<n;i++)
    {
        cie[i]=ss.nextDouble();
        credits[i]=ss.nextInt();
    }
    }
    
}
class exam extends test
{
    double see[];
	 void readsee()
    {
    System.out.println("enter the see marks");
    Scanner ss=new Scanner(System.in);
    see=new double[n];
    int i;
    for(i=0;i<n;i++)
    {
        see[i]=ss.nextDouble();
        
    }
    }
}


class result extends exam
{
    float result;
	int score[]=new int[n+1];
    void calc()
   {
	   int i;
	   float sum=0,sumc=0;
       for(i=0;i<n;i++)
      {
	  double z;
	  z=cie[i]+(see[i]/2);
            if(z>=90)
				score[i]=10;
			else if(z>=80)
				score[i]=9;
			else if(z>=70)
				score[i]=8;
			else if(z>=60)
				score[i]=7;
			else if(z>=50)
				score[i]=6;
			else if(z>=40)
				score[i]=5;
			else score[i]=4;

       sum+=score[i]*credits[i];
       sumc+=credits[i];
   }
   result=sum/sumc;
   
   }
   void display()
   {
	   System.out.println("name= "+name+"usn= "+usn+"semester= "+sem+"sgpa= "+result);
   }
}
class sgpa
{
    public static void main(String[] args) 
    {
        System.out.println("enter the number of students");
        
        Scanner ss=new Scanner(System.in);
        int x=ss.nextInt();
        result res[]=new result[x];
        int i;
        float y;
        for (i=0;i<x;i++)
        {
            res[i]=new result();
			System.out.println("enter the usn name and semester of the student "+(i+1));
            res[i].readname();
            res[i].readmarks();
            res[i].readsee();
            res[i].calc();
			System.out.println("the details of student "+(i+1)+"are");
			res[i].display();
            
        }
    }
}
