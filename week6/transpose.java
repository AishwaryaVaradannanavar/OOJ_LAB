import java.util.Scanner;
class transpose
{

public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("enter the number of elements m and n  ");
int n=sc.nextInt();
int m=sc.nextInt();
int a[][]=new int[n][m];
int b[][]=new int[m][n];
System.out.println("enter the elements  ");
int i,j;
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
 a[i][j]=sc.nextInt();
 b[j][i]=a[i][j];
 
}

}
System.out.println("transpose matrix is");
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
	 
     System.out.print(b[i][j]+"\t");
}
System.out.print("\n");
}
}
}
