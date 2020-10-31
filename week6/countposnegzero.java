import java.util.Scanner;
class countnegposzero
{
	public static void main(String args[])
	{
	 Scanner sc= new Scanner(System.in);
     System.out.println("enter the number of elements ");
	 int a=sc.nextInt();
	 System.out.println("enter the elements ");
	 double full[]=new double[a];
	 double neg[]=new double[a];
	 double pos[]=new double[a];
	 int i,p=0,n=0,z=0;
	 for(i=0;i<a;i++)
	 {
		 full[i]=sc.nextDouble();
		 if(full[i]<0)
		 {
			 neg[n]=full[i];
		     n++;
		 }
		 if(full[i]>0)
		 {
			 pos[p]=full[i];
			 p++;
		 }
		 if(full[i]==0)
			 z++;
			 
	 }
	 System.out.println("number of positive= "+p+ " negetive= "+n+"zeros= "+z);
}
}
	 
