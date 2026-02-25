package Loops;

public class Loop_alphabet {

	public static void main(String[] args) 
	{
		
//		*****
//		  *  
//		  *  
//		  *  
//		  *  
		
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=5;j++)
//			{
//				if((i==1) || (i>=2 && j==3))
//				{
//					System.out.print("*");
//				}
//				else
//				{
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
		
//		* * * * * 
//		*     
//		* * * * * 
//		*     
//		*     
//		*
		
		
//		for(int i=1;i<=6;i++)
//		{
//			for(int j=1;j<=5;j++)
//			{
//				if((i==1 || j==1 || i==3))
//				{
//					System.out.print("* ");
//				}
//				else
//				{
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
//		*****
//		*    
//		*****
//		    *
//		*****
		
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=5;j++)
//			{
//				if((i==1 || i==5 || i==3) || (i==2 && j==1) || (i==4 && j==5))
//				{
//					System.out.print("*");
//				}
//				else
//				{
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
		
//		*****
//		*   *
//		* * *
//		*    
//		*    
		
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=5;j++)
//			{
//				if(i==1 || (i>=2 && j==1) || (i<=3 && j==5) || (i==3 && j==3))
//				{
//					System.out.print("*");
//				}
//				else
//				{
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
		
//		*   *
//		**  *
//		* * *
//		*  **
//		*   *
		
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=5;j++)
//			{
//				if((i<=5 && j==1) || (i<=5 && j==5) || (i==j))
//				{
//					System.out.print("*");
//				}
//				else
//				{
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
		
//		11111
//		10001
//		10001
//		10001
//		11111
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if((i==5 || i==1 && (j<=5)) || (i>=2 && (j==5 || j==1)))
				{
					System.out.print("1");
				}
				else
				{
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}

}
