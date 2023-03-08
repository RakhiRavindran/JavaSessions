package basicJava;

public class SarrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//write a program to find maximum and minimum element in array
		int num[]= new int[5];
		num[0]=2000;
		num[1]=36;
		num[2]=4;
		num[3]=872365;
		num[4]=3000;
		int tem=num[0];
		int min=num[0];
		for (int i = 0; i < num.length; i++) {
			if(num[i]>tem) {
		        tem=num[i];
			}
			 if(num[i]<min){
				min=num[i];
			}
		
		}
		System.out.println("Largest value"+tem);
		System.out.println("smalest value"+min);
		System.out.println("*******set array value in ascending*******");
		

	}

}
