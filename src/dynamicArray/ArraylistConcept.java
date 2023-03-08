package dynamicArray;

import java.util.ArrayList;

public class ArraylistConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al=new ArrayList();
		al.add(100);
		al.add("testing");
		al.add('c');
		al.add(12.33);//to add values in arraylist
		al.add("selenium");
		
		System.out.println(al);//to print all array list
		System.out.println(al.get(2));//to get values from list and index
		System.out.println(al.get(3));
		al.remove(3);//to remove value from 3rd index
		System.out.println(al.get(3));//4th index valu will move to 3rd after 3rd got removed
		System.out.println("********using for loop******");
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
			
		}
		System.out.println();
		
		for (Object obj : al) {
			
			System.out.println(obj);
			
		}
		
		//To overcome this warning while adding declare as type
		
		ArrayList<Integer> aint=new ArrayList<Integer>();
		ArrayList<String> astring=new ArrayList<String>();//only specified class can add this arraylist
		System.out.println();
		
		ArrayList<Object> empData=new ArrayList<Object>();//can add all type of values
		empData.add("rakhi");
		empData.add(12.33);
		empData.add('T');
		empData.add(true);
		System.out.println();
	 
		System.out.println(empData.get(0));
		for(Object o : empData) {
			System.out.println(o);
		}
		
		
		

	}

}
