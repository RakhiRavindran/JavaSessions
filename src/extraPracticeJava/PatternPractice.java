package extraPracticeJava;

public class PatternPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=9;i++) {
			for(int j=0;j<=9;j++) {//if j<=i pattern willbe 00 /10 11/10 11 12
				System.out.print(i+""+j+" ");
				//System.out.print("*");
				
			}
			System.out.println();
		}
	/*	int n=11;
		for (int i = 1; i <=n; i++) {
			for(int j=1; j<=(n/2);j++) {
				System.out.print(" ");
				
			}
			System.out.print("*");
			n=n-1;
			
		}*/
		
		int rows = 5, k = 0;

	    for (int i = 1; i <= rows; ++i,k=0) {
	      for (int space = 1; space <= rows - i; ++space) {
	        System.out.print("  ");
	      }

	      while (k != 2 * i - 1) {
	        System.out.print("* ");
	        ++k;
	      }

	      System.out.println();
	    }


	}

}
