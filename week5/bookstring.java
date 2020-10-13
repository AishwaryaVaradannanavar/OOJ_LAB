import java.util.Scanner;
class book
{
	private String name,author;
	private double price;
	private int pages;
	
	book()
	{
		name="abcd";
		author="xyz";
		price=0.0;
		pages=0;
	}
	void get()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name, auhor, price, number of pages of the book ");
		name=sc.next();
		author=sc.next();
		price=sc.nextDouble();
		pages=sc.nextInt();
	}
	
	public String toString()
	{
		return("book: "+name+" author: "+author+" price:Rs."+price+" pages: "+pages);
	}
}

class books
{
	public static void main(String args[])
	{
		Scanner xx=new Scanner(System.in);
		System.out.println("enter the no. of books");
		int n=xx.nextInt();
		book b[]=new book[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("book no. "+(i+1));
			b[i]=new book();
			b[i].get();
		}
		System.out.println("book details: ");
		for(int i=0;i<n;i++)
		{
			System.out.println("book no. "+(i+1));
			System.out.println(b[i]);
			
		}
	}
}
