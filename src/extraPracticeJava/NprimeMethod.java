package extraPracticeJava;

import java.util.ArrayList;
import java.util.List;

public class NprimeMethod {
	
	public List<Integer> getNPrime(int n) {
		
		List<Integer>prime=new ArrayList<Integer>();
		for(int i=1;i<=n;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
			if(i%j==0) {
				count++;
			}
			}
			
			if(count==2) {
				//System.out.print(i+" ");
				prime.add(i);
				
			}
		}
	
		return prime;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		NprimeMethod np= new NprimeMethod();
		
				
		System.out.println(np.getNPrime(10));
		//np.getNPrime(10);
		

	}

}
