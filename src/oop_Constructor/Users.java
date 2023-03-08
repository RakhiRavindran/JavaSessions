package oop_Constructor;///Template and main methods in one class

public class Users {
	
	//Assume there is an application where user has to register
	//Creating a constructor helps to reduce the codes,restrict the object creation which will save the memory
	//Constructor is apart of template [Class template includes class variables,userdefined methods,constuctor]
	
	
	String name;
	String email;
	String passWord;
	int age;
	String phone;
	
	public Users(String name) {//same class name
		this.name=name;//local variable assign to class variable
	}
	
	//right click>source>gener. constructor using fields

	public Users(String name, String email, String passWord, int age, String phone) {
		//super();-->this will discuss later
		this.name = name;
		this.email = email;
		this.passWord = passWord;
		this.age = age;
		this.phone = phone;
	}
	
	public Users(String email, String passWord) {
		//super();
		this.email = email;
		this.passWord = passWord;
	}

	
	
	public static void main(String[] args) {//main method calling functionality..acting as user interaction
		// TODO Auto-generated method stub
		//Users u1=new Users();-->if no constructor is created>hiiden default contructor will call by JVM

		//As 1 constructor is created object should be with same parameter and structure
		Users u1=new Users("Tom");// here the value ('Tom') should be passed
		System.out.println(u1.passWord+" "+u1.name);//only name value is assigned>o/p>null Tom
		
		Users u2=new Users("rakhi","rakhi@gmail.com", "1234", 30, "98563201470");
		Users u3=new Users("abc@gmail.com", "w1234");
		
		System.out.println(u2.age+","+u2.email+","+u2.name+","+u2.passWord+","+u2.phone+"----"+u3.email);
		
	}

}
