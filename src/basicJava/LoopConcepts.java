package basicJava;



public class LoopConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=9;i++) {
			System.out.println("Iam a batsaman");
			System.out.println("I am a batsman"+" "+i);
		}
		
		System.out.println("--------------");
		
		int i=1;
		while (i<=10) {
			System.out.println("Hello world");
			i++;
		}
		System.out.println("--------------");
		
		for(int i1=1;i1<=100;i1++) {
			//System.out.println("Even numbers are:");
			if(i1%2==0) {
				System.out.print(" "+i1);
			}
			//System.out.println("Odd numbers are:");
			/*if(i1%2!=0) {
				//System.out.print(" "+i1);
			}*/
			
			
		}
		for(int i1=1;i1<=100;i1++) {
			
			
			System.out.println("Odd numbers are:");
			if(i1%2!=0) {
				System.out.print(" "+i1);
			}
			
			
		}
		//To print ASCII value of A-Z , a-z, 0-9
		// using while and for
		System.out.println("--------------");
		//System.out.println((int)'a');
		int val = 'a';// Here ASCII value of the charactor 'a' stored in to val variable..
					  //.bcz 'a' indicates charactor and it is assigning to int data type
		while (val<='z') {
			System.out.println(val);
			val++;
			
		}
		for (char j ='A' ; j <='Z' ; j++) {
			System.out.println((int)j);
			
		}

	}

}
