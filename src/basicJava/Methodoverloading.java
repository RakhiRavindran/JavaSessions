package basicJava;

public class Methodoverloading {
	
	//login with differen option and return boolean
	public boolean login(String phone,String pw) {
		boolean flag= false;
		if(phone.equalsIgnoreCase("9495067662")&& pw.equalsIgnoreCase("rakhi")) {
			System.out.println("Successfully login");
			flag = true;
		}
		else {
			System.out.println("failed to login");
			//flag= false;
		}
		return flag;
		
	}
	
	public boolean login(String un,String pw,String otp) {
		boolean flag=false;
		if(un.equalsIgnoreCase("abc")&&pw.equalsIgnoreCase("rakhi")&&otp.equalsIgnoreCase("123")) {
			System.out.println("Successfully login");
			flag=true;
		}
		else {
			System.out.println("Failed to login");
			//flag=false;
		}
		return flag;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverloading ml= new Methodoverloading();
		System.out.println(ml.login("9874563210", "123"));
		System.out.println(ml.login("abc", "rakhi", "123"));

	}

}
