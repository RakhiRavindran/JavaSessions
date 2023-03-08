package dynamicArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionClass {

	public static void main(String[] args) {
		List<String>empList=new ArrayList<String>();
		empList.add("Tom");
		empList.add("Deepak");
		empList.add("Sreya");
		empList.add("Hiten");
		
		System.out.println(empList);
	    
		Collections.reverse(empList);
	    System.out.println(empList);
		
	    Collections.sort(empList);
	    System.out.println(empList);
	   
	    Collections.swap(empList, 2, 0);
	    System.out.println(empList);
	    
	    System.out.println(empList.remove(1));
	    
	    
	    empList.add(1,"ravi");
	    System.out.println(empList);
	    
	    //empList.add(10,"rakhi");This will throws IOBE bcz from 3 to 9 there is no value assigned
	    //empList.get(50); which is also throws IOBE
	    

	}

}
