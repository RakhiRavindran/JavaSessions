package oop_Encapsualation;

public class Employee {
	private String name;
	private int age;
	private boolean isActive;
	private String gender;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public boolean getActive() {
		return isActive;
	}
	
	public void setActive(boolean isActive) {
		this.isActive=isActive;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender=gender;
		
	}
	
	
	

	public void employeeInfo() {
		
		System.out.println("employeee info :");
		System.out.println(name+","+age+","+isActive+","+gender);
		
		//System.out.println(getName()+","+getAge()+","+getGender()+","+getActive());
		
	}

	

}
