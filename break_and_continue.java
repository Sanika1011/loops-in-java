package loops;

public class break_and_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i=0; i<5;i++) {
			System.out.println(i);
			System.out.println("java is gr8");
			if(i==3) {
				System.out.println("ending the loop");
				break;
			}
		}*/
		
		/*int i=0;
		while(i<5) {
			System.out.println(i);
			System.out.println("java is gr8");
			if(i==3) {
				System.out.println("ending the loop");
				break;
			}
			i++;
		}
		System.out.println("loop ends here");*/
		
		
		/*int i=0;
		do {
			System.out.println(i);
			System.out.println("java is gr8");
			if(i==3) {
				System.out.println("ending the loop");
				break;
			}
			i++;
		}while(i<5);
		System.out.println("loop ends here");*/
		
		
		/*for(int i=0; i<50;i++) {
		if(i==3) {
			System.out.println("ending the loop");
			continue;
		}
		System.out.println(i);
		System.out.println("java is gr8");
		}*/
		
		
		int i=0;
		do {
			i++;
			if(i==3) {
				System.out.println("ending the loop");
				continue;
			}
			System.out.println(i);
			System.out.println("java is gr8");
			
		}while(i<5);
		System.out.println("loop ends here");
		
	
	}
}
	


