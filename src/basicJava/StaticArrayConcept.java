package basicJava;

import java.util.Arrays;

public class StaticArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks[] = new int[10];
		marks[8]= 98;
		System.out.println(marks.length);
		System.out.println("hightest index is :" +(marks.length-1));
		//marks[10]=52; Array index out of bound exception [AIOB]
		
		
		System.out.println("*****Array literal*****");
		
		String name[]= { "Tom","Hari","Jacob","Anu"};
		System.out.println("The array values are"+ Arrays.toString(name));
		
		System.out.println("********printing values using for loop******");
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i]);
			
		}
		System.out.println("*****for each******");
		for (String n : name) {
			System.out.println(n);
			
		}
		for (int m : marks) {
			System.out.print(m+" ");
			
			
		}
		
		System.out.println("********Object Array********");
		
		Object employee[] = new Object[20];
		employee[2]="rakhi";
		employee[5]="30";
		employee[18]="Senior tester";
		
		for (Object obj : employee) {
			System.out.print(obj+" ");
		}
		System.out.println();
		System.out.println(Arrays.toString(employee));
		
	}

}
