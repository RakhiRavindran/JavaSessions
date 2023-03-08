package stringManupulation;

public class SCP_heap {

	public static void main(String[] args) {
		
		//String literals
		String str= "Selenium";
		String str1="Selenium"; //one value stored under SCP with 2 ref.
		
		//String Object with new keyword
		String s1=new String("Testing");//2 object will create while execute this line>1under SCP and 1 under heap
		String s2=new String("Testing");//again only 1 object under heap while executing this>nothing under SCP
										//bcz the value "Testing" Available under SCP already(no duplicate value will store)
		String str2="Testing";//no value will be added but str2 will pointed to already available value
		String str3="Testing";//Again no value will added,str3 will pointed to already available one
		
		System.out.println(str==str1);//true as both pointed to same value in scp[string literal]
		System.out.println(s1==s2);//false[even if values are same] if we compare string object it will compare the reference address
		System.out.println(str2==str3);//true
		System.out.println(s2==str2);//false> even if values are same
		
		System.out.println();
		
		System.out.println(s1.equals(s2));//Equal methods will compare based on the values not address
		System.out.println(str2.equals(str3));
		System.out.println(s2.equals(str2));
		
		System.out.println();
		
		
		

	}

}
