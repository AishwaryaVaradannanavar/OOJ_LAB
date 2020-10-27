import java.util.Scanner;
abstract class Player
{
	String name;
	int matches_played;
	double avg;
	
	abstract void cal_average(String s, int m, int r);
}

class Batsman extends Player
{
	int runs_scored;
	
	void cal_average(String s, int m, int r)
	{
		name= s;
		matches_played=m;
		runs_scored=r;
		
		avg = runs_scored/matches_played;
		System.out.println("Average runs scored is "+avg);
	}
}
class Bowler extends Player
{
	int runs_given;
	
	void cal_average(String s, int m, int r)
	{
		name=s;
		matches_played= m;
		runs_given= r;
		
		avg= runs_given/matches_played;
		System.out.println("Average runs given is "+avg);
	}
}

class cricket
{
	public static void main(String ss[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of bowlers");
		int bo = sc.nextInt();
		System.out.println("Enter the number of batsmen");
		int ba = sc.nextInt();
		Bowler b1[] = new Bowler[bo];
		Batsman b2[] = new Batsman[ba];
		int i;
		System.out.println("The bowlers are ");
		for(i=0;i<bo;i++)
		{
			b1[i]= new Bowler();
			System.out.println("Enter the name of the bowler "+(i+1));
			String boname= sc.next();
			System.out.println("Enter the number of matches played");
			int bomatch= sc.nextInt();
			System.out.println("Enter the number of runs given");
			int boruns= sc.nextInt();
			b1[i].cal_average(boname,bomatch,boruns);
		}
		System.out.println("The batsmen are ");
		for(i=0;i<ba;i++)
		{
			b2[i]= new Batsman();
			System.out.println("Enter the name of the batsman "+(i+1));
			String baname= sc.next();
			System.out.println("Enter the number of matches played");
			int bamatch= sc.nextInt();
			System.out.println("Enter the number of runs scored");
			int baruns= sc.nextInt();
			b2[i].cal_average(baname,bamatch,baruns);
		}
	}
}
