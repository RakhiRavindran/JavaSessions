package builderPattern;

public class CallByRef {
	String name;
	int age;

	//call by reference
	public void getEmployeeinfo(CallByRef cbr) {
		cbr.name="Tom";
		cbr.age=20;
		System.out.println("abc");
	}
	
	//Call by value
	public void add(int a, int b) {
		int c=a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		CallByRef c=new CallByRef();
		System.out.println(c.age+","+c.name);//o/p will be 0 and null because hee variable is not getting assigned any value
		
		c.getEmployeeinfo(c);//call by reference
		System.out.println(c.age+" ,"+c.name);
		
		c.add(10, 15);//Call by value
	
		
	}
}
