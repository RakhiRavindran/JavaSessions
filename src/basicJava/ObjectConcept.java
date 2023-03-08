package basicJava;

public class ObjectConcept {
	
	String name; //The variables declare in class (outside main method)can be access by all objects 
	double salary;
	int age;
	

	public static void main(String[] args) {
		// First method to delcare a object with refernce name
		ObjectConcept ob= new ObjectConcept(); ///here one object is getting created then using reference name 
		ob.name="Tom";
		ob.salary=569888;
		System.out.println(ob.name+", "+ob.salary+", ");
		
		System.out.println(ob.age);//default value will print
		
		
		
		// without reference name
		
		new ObjectConcept().name = "abc";//this line creats an object
		new ObjectConcept().age=29;//this line create another object in memory
		
		//System.out.println(new ObjectConcept().name);
		
		//object assign to null=>assign object reference name to null
		ObjectConcept ob1=new ObjectConcept();
		ob1.name="rakhi";
		System.out.println(ob1.name+" "+ob1.age);
		
		/*ob1=null;
		ob1.age=30;
		System.out.println(ob1.name+" "+ob1.age);*/ //Null pointerexception
		
		

	}

}
