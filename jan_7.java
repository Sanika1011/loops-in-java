package Loops;

import java.util.Scanner;

public class jan_7 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of passengers: ");
		int n = sc.nextInt();
		
		
		
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter balance:");
			int balance = sc.nextInt();
			System.out.println("Passenger " + i + " balance: "+ balance);
			if(balance>=50)
			{
				System.out.println("Entry allowed.");
				System.out.println();
			}
			else
			{
				System.out.println("Entry Denied.");
				System.out.println();
			}
		}
		
		
	}

}
