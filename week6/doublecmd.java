import java.util.Scanner;
class doublecmd
{
public static void main(String s[])
{
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of elements ");
		int n=sc.nextInt();
		int i,j;
		double b[]=new double[n];
		for (i = 0; i <n; i++) 
		{
			b[i]=Double.parseDouble(s[i]);
		}

double temp;

for (i = 0; i <n; i++) 
{     
          for (j = i+1; j <n; j++) {     
              if(b[i] >b[j])
				  {     
                 temp = b[i];    
                 b[i] = b[j];    
                 b[j] = temp;    
               }     
            }     
			}    
for(i=0;i<n;i++)
{
	System.out.println(b[i]);
}
}
}
