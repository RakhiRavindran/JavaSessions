package dynamicArray;

public class HashMap {

	public static void main(String[] args) {
		
		java.util.HashMap<String,Integer>empMap=new java.util.HashMap<String,Integer>();
		
		empMap.put("rakhi", 30);
		empMap.put("Arun", 35);
		empMap.put("ravi", 60);
		empMap.put("bindu", 68);
		empMap.put("indu", 80);
		empMap.put("rakhi", 13);
		
		System.out.println(empMap.get("bindu"));
		System.out.println(empMap.get("rakhi"));
		
		empMap.put("preeta", null);
		empMap.put(null, 98);
		
		System.out.println(empMap.get(null));
		System.out.println(empMap.get("preeta"));
		
		
		empMap.put(null, null);
		System.out.println(empMap.get(null));
		
		System.out.println(empMap);//{null=null, Arun=35, ravi=60, indu=80, rakhi=13, preeta=null, bindu=68}
		
	}

}
