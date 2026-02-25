package Loops;

public class Reverse_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int num=10;num>=1;num--)
//		{
//			System.out.print(num+" ");
//		}
		int Oddsum=0,Evensum=0;	
		for(int i=1;i<=100;i++)
		{
			if(!(i%2==0)) //if(i%2!=0)
			{
				 Oddsum = Oddsum+i;
			}
			else
			{
				Evensum = Evensum+i;
			}
		}
		System.out.println("Evensum: "+Evensum);
		System.out.println("Oddsum: "+Oddsum);
	}

}
