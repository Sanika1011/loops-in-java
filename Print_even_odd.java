package Loops;

import java.util.Scanner;

public class Print_even_odd {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n: ");
		int n = sc.nextInt();
		
		for(int count=1;count<=n;count++) 
		{
			System.out.println("Enter num: ");
			int num = sc.nextInt();
			
			if(num%2==0)
			{
				System.out.println("Even number");
			}
			else 
			{
				System.out.println("Odd number");
			}
		}

	}

}
