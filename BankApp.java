import java.io.*;
import java.lang.*;


class BankAccount 
{
	private double balance;
	
	
	public BankAccount(double amount )
	

{
		balance=amount;
		
		}
	public void deposit (double deposited_amount)
	{
		balance= balance+deposited_amount;
	}
	public void withdraw ( double withdrawn_amount)
	{
		balance= balance-withdrawn_amount;
		
	}
	public void add_interest(double percent)
	{
		balance = balance + (percent*balance/100);
	}
	public void display ()
	{
		System.out.println(balance);
	}

}

class BankApp
{
	public static void main (String args[])

{
		int g = Integer.parseInt(args[0]);
		  Binary(g);
		 } 

		 public static void Binary(int int1){
		    System.out.println(int1 + " in binary is ");
		    do{
		    	System.out.print(int1 % 2);
		    	int1/=2;
		    	
		    }while(int1>0);
		    

		BankAccount ba = new BankAccount(100.0);
		

	System.out.println("\n The initial balance was " );
	ba.display();
	ba.deposit(200);
	ba.withdraw(150);
	
	System.out.println("final balance is ");
	ba.display();
	ba.add_interest(20);
	System.out.println("After adding interest");
	ba.display();
	int month[]= new int[12];
	int i;
	for(i=0;i<12;i++)
	{
		month[i]=i+10;
	}
	
	//month[5]=67;
	double s=130;
	byte b=5;
	System.out.println(  (byte)s);
	for(i=0;i<12;i++)
	{
			
	System.out.println("the  element in the array is "+ month[i]);
	}
	
	// program to check armstrong number or no ...
	
	int j=471;
	 int p=j/100;
	 int q=j%10;
	 int z= (j%100)/10;
	 int x=12;
	 String str[]={Integer.toBinaryString(4)};
	 x=x>>2;
	 
	 System.out.println("binary equivalent"+ str[0]);
	System.out.println("bitwise "+ x);
	 //System.out.println("binary equivalent"+ str);
	 //System.out.println("binary equivalent"+ str);
	 int rows=20;
			 int ii,jj=0,space;
	    
	    for(ii=rows;ii>=1;--ii)
	    {
	    	for(space=0;space<rows-ii;++space)
		          System.out.print("  ");
	        
	       
	    	while(jj!=2*ii-1)
	        {
	           System.out.print("* ");
	           ++jj;
	        }
	        jj=0;
	        
	        
	        
	        System.out.println();
	    }
	     
	 System.out.println(p);
	
	 System.out.println(z);
	 
	 System.out.println(q);
	 
	 if(cube(p)+ cube(q)+cube(z) == j )
	 {
		 System.out.println("armstrong number");
	 }
	 else{
		 System.out.println("not armstrong");}
	 }

	private static int cube(int v) {
		return v=v*v*v;
		
	}
	
}
	 
	 

	

	
