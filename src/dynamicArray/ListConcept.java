package dynamicArray;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class ListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>nameList= new ArrayList<String>();//its topcasting::list is interface
		nameList.add("Tom");
		nameList.add("Peter");
		nameList.add("Naveen");
		
		System.out.println(nameList);//to print arryalist values
		for (String s : nameList) {
			System.out.println(s);
		}
		//kind of dynamic array literal
		
		List<String> browser=Arrays.asList("Jerry","vishnu","Swagath");
		System.out.println(browser);
		
		//Static Array to Dynamic array
		String country[]= {"Sigapore","India","Japan","Nepal","Newziland"};
		List<String> c =Arrays.asList(country);
		System.out.println("Country list is:"+c);
		
		
		
		
		
		
		

	}

}
