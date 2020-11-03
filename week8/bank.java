import java.util.Scanner;
import java.lang.Math;
class account
{
	String name,accno,type;
	float bal;
	int option;
	float deposit,rate,years,withdrawal=0;
	
	account()
	{
	Scanner sc= new Scanner(System.in);
    System.out.println("Enter the name , account number, type of bank account, balance");
	name=sc.next();
	accno=sc.next();
	type=sc.next();
	bal=sc.nextFloat();
	}
	void display()
	{
		System.out.println("the name= "+name+"account number= "+accno+" type of bank account= "+type+" balance= Rs. "+bal);
	}
}
class sav_acct extends account
{
	float ci=0;
	boolean checkbookfacility= false;
	void sav_activity()
	{
		Scanner sc= new Scanner(System.in);
	do{
		System.out.println("\n");
		System.out.println("choose option for your savings account :1.deposit money (with compound interest)  2.withdraw money  3.check balance 4.checkbook  5.exit");

	option =sc.nextInt();
	
		switch (option)
		{
		case 1: {
			System.out.println("enter the deposit amount, rate of interest ,number of years");
			deposit =sc.nextFloat();
			rate=sc.nextFloat();
			years=sc.nextFloat();
			ci= deposit*((float)Math.pow((1+(rate/100)),years));
			bal=bal+ci;
		    break;
		}
		case 2:{
		    System.out.println("enter the amount you want to withdraw");
		    withdrawal=sc.nextFloat();
			bal=bal-withdrawal;
		    break;
		}
		case 3:{
			
			System.out.println("the remaining balance is= Rs. "+ bal);
			break;
		}
		case 4:{
			if(checkbookfacility)
		
			System.out.println("check book provided in savings account");
			else
				System.out.println("check book not provided in savings account");
			break;
		}
		case 5:break;
		default:{
			System.out.println("invalid option");
		}
		}
		
	}while(option!=5);
	}
}
class curr_acct extends account
{
	boolean checkbookfacility = true;
	void curr_activity()
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the minimum balance for the current accounts and penalty");
		float min=sc.nextFloat();
		float penalty=sc.nextFloat();
		do{
			System.out.println("\n");
	    System.out.println("choose option for your savings account :1.deposit money (with no interest) 2.withdraw money  3.check balance  4.checkbook  5.exit");
	    
		option =sc.nextInt();
		
			switch (option)
			{
				case 1:{
					System.out.println("enter the deposit amount");
					deposit =sc.nextFloat();
					bal=bal+deposit;
					break;
				}
				case 2:{
					System.out.println("enter the amount you want to withdraw");
		            withdrawal=sc.nextFloat();
					bal=bal-withdrawal;
		            break;
		        }
				case 3:{
					
					if(bal<min)
			          {
				       bal-=penalty;
					   System.out.println("the penalty for not maintaining minimum balance has been deducted= "+ penalty);
			          }
					System.out.println("the remaining balance is= Rs. "+ bal);
					break;
				}
				case 4:{
			          if(checkbookfacility)
		
			            System.out.println("check book provided in savings account");
			          else
				          System.out.println("check book not provided in savings account");
					  break;
		        }
				case 5:break;
				default:{
			        System.out.println("invalid option");
		        }
		    }
		
	    }while(option!=5);
		
	}
}
class bank{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
        System.out.println("Enter the type of account 1.savings 2.current");
		int type=sc.nextInt();
		if(type==1)
		{
			sav_acct s=new sav_acct();
			s.sav_activity();
			s.display();
		}
		if(type==2)
		{
			curr_acct c=new curr_acct();
			c.curr_activity();
			c.display();
		} 
	}
}
		
