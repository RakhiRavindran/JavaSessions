package basicJava;

import java.util.Scanner;

public class LoopConceptsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Print the pattern 0 5 10 15...95 100
		for(int i=0;i<=100;i++) {
			if(i%5==0) {
				System.out.println(i);
			}
		}
		
		//Print only vowels (aeiou) using for and while loop
		char i='a';
		while((int) i<='z') {
			if(i=='a' || i=='e' ||i=='i' || i=='o'|| i=='u') {
				System.out.println(i);
				
			}
		/*	if(i=='e') {
				
				System.out.println('e');
			}*/
				
			i++;
		}
		
		System.out.println("****************");
		//break the loop when multiples of 7 appeared
		
		for (int j = 1; j <=10; j++) {
			System.out.println(j);
			if(j%7==0) {
				System.out.println("bye see you tomorrow");
				break;
			}
					
		}
		
		System.out.println("*************************");
		//cricket score card
		Scanner sc1 =new Scanner(System.in);
		System.out.println("enter score");
		int score = sc1.nextInt();		
		for(int j=1;j<=100;j++) {
			if(score==0) {
				System.out.println("duck");
				break;
			}
			else if(score==25) {
				System.out.println("good job");
				break;
			}
			else if(score==50) {
				System.out.println("good job -Half century");
				break;
			}
			else {
				
				System.out.println("score is:"+score);
				break;
				}
		}
		sc1.close();

	}

}
