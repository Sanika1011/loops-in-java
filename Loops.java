package Loops;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) 
	{
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter your name: ");
//		String name = sc.nextLine();
		//for loop =>
		//step1:initialize the loop
		//step2:add condition
		//step3:increment or decrement
		
//		for(int count=1;count<=10;count++)
//		{
//			System.out.println(name+" "+count);
//		}
		
		Scanner sc = new Scanner(System.in);
		int rate1=0,rate2=0,rate=0,rate3=0,rate4=0,rate5=0;
		
		for(int i=0;i<=10;i++) 
		{
			System.out.println("enter rating: ");
			int rating=sc.nextInt();
			
			if(rating==1)
			{
				rate1++;
			}
			else if(rating==2)
			{
				rate2++;
			}
			else if(rating==3)
			{
				rate3++;
			}
			else if(rating==4)
			{
				rate4++;
			}
			else if(rating==5)
			{
				rate5++;
			}
			else
			{
				System.out.println("enter valid rating..");
			}
		}
		System.out.println("rating 1: "+ rate1);
		System.out.println("rating 2: "+ rate2);
		System.out.println("rating 3: "+ rate3);
		System.out.println("rating 4: "+ rate4);
		System.out.println("rating 5: "+ rate5);
	}

}
