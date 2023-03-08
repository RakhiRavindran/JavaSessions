package basicJava;

public class MethodConcept {
	
	//no input no return
	public void sum() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		
	}
	//no input but return value
	public double areaOfCircle() {
		double r=6;
		double area=(22/7)*(r*r);
		return area;
	}
	
	//input with return value
	public String findGrade(int marks) {
		//String grade=null;
		if(marks>=0 && marks<=100) {
			int score=marks/10;
		
		switch (score) {
		case 10:
			//return "A";
		case 9:
			return "A";
			//grade ="A";
			
		case 8:
			return "B";
		case 7:
			return "c";
			
		case 6:
			return "D";
		case 5:
			return "E";
		case 4:
			return "F";
		
		default:
			return "Failed";
		}
		}
		//return grade; //if grade is returning as common then should assisgn each case value to grade intead of return
		return "Not a marks";
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodConcept mc= new MethodConcept(); //created an object to call method(method is a data member in class)
		mc.sum();
		System.out.println(mc.areaOfCircle());
		System.out.println(mc.findGrade(90));

	}

}
