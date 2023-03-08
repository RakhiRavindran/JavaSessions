package basicJava;

public class ConditionalOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=104;
		int num2=10;
		int num3=120;
		
		if (num1>=num2 && num1>=num3) {
			System.out.println("Greatest number is:"+num1);
			
		}
		else if (num2>=num1 && num2>=num3) {
			System.out.println("Greatest number is"+num2);
			
		}
		else
			System.out.println("Greatest number="+" "+num3);
		
		System.out.println("--------------");
		
		int temp=num1>num2?num1:num2;// if num1 > num2 then temp=num1 else temp=num2
		int larg=temp>num3?temp:num3;
		System.out.println("highest value:"+larg);


	}

}
