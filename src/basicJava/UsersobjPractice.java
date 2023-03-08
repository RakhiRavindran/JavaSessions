package basicJava;

public class UsersobjPractice {
	
	String name;
	double yoex;
	String designation;
	boolean isActive;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsersobjPractice u1= new UsersobjPractice();
		u1.name="Rakhi";
		u1.isActive=true;
		u1.designation="tester";
		u1.yoex=5.9;
		
		UsersobjPractice u2=new UsersobjPractice();
		u2.name="Dia";
		u2.isActive=false;
		u2.designation="QA";
		u2.yoex=8;
		
		UsersobjPractice u3 = new UsersobjPractice();
		u3.name="Hiten";
		u3.designation="Software engg.";
		u3.isActive=true;
		u3.yoex=1;
		
		System.out.println(u1.name+","+u1.designation+","+u1.yoex+","+u1.isActive);
		System.out.println(u2.name+","+u2.designation+","+u2.yoex+","+u2.isActive);
		System.out.println(u3.name+","+u3.designation+","+u3.yoex+","+u3.isActive);
		System.out.println();
		
		u1=u2;//here all object values are pointing by u1 as well as u2
		System.out.println(u1.name+","+u1.designation+","+u1.yoex+","+u1.isActive);
		System.out.println(u2.name+","+u2.designation+","+u2.yoex+","+u2.isActive);
		System.out.println(u3.name+","+u3.designation+","+u3.yoex+","+u3.isActive);
		System.out.println();
		
		u2=u3;
		System.out.println(u1.name+","+u1.designation+","+u1.yoex+","+u1.isActive);
		System.out.println(u2.name+","+u2.designation+","+u2.yoex+","+u2.isActive);
		System.out.println(u3.name+","+u3.designation+","+u3.yoex+","+u3.isActive);
		System.out.println();
		
		u3=u1;
		System.out.println(u1.name+","+u1.designation+","+u1.yoex+","+u1.isActive);
		System.out.println(u2.name+","+u2.designation+","+u2.yoex+","+u2.isActive);
		System.out.println(u3.name+","+u3.designation+","+u3.yoex+","+u3.isActive);
		System.out.println();
		
		u3=u2;
		System.out.println(u1.name+","+u1.designation+","+u1.yoex+","+u1.isActive);
		System.out.println(u2.name+","+u2.designation+","+u2.yoex+","+u2.isActive);
		System.out.println(u3.name+","+u3.designation+","+u3.yoex+","+u3.isActive);
		System.out.println();
		u1.abc=10;
		System.out.println(u1.abc);
		//note==>the current object value will get assign to the refrence variable..ex-u3=u2 ..here u3 will pointed to the u2's current object 
	}
	    int abc;

}
