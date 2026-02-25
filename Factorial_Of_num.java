package Loops;

import java.util.Scanner;

public class Factorial_Of_num {

	public static void main(String[] args) 
	{
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter n: ");
//		int n = sc.nextInt();
		
//		int fact=1;
//		for(int i=1;i<=n;i++)
//		{
//			fact=fact*i;
//		}
//		System.out.println("Factorial of "+n+" is : "+fact);
		
		
//		for(int i=n;i>=1;i--)
//		{
//			fact=fact*i;
//		}
//		System.out.println("Factorial of "+n+" is : "+fact);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num: ");
		int num = sc.nextInt();
		int count=0;
		
//		for(;num!=0;)
//		{
//			num=num/10;
//			count++;
//		}
//		System.out.println("num of digit: "+count);
		int rev=0;
		for(;num!=0;)
			{
				int rem=num%10;   //num=123 1-> 123%10=3
				rev=rev*10+rem;  //rev=0*10+3-> 
				num=num/10;
				
			}
			System.out.println("num of digit: "+rev);

	}

}
