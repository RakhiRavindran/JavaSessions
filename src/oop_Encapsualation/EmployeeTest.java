package oop_Encapsualation;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		e1.setAge(30);;
		e1.setGender("Female");
		e1.setActive(true);
		e1.setName("rakhi");
		
		//System.out.println(e1.getName()+","+e1.getAge()+","+e1.getGender()+","+e1.getIsActive());
		
		e1.employeeInfo();
		

	}

}
