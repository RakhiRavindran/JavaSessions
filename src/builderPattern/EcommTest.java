package builderPattern;

public class EcommTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EcommApplication app=new EcommApplication();
		app.login("r@gmail.com", "1234")
			.doSearch("MacBook")
				.addToCart("MacBook")
					.payment("sudhisu");
		
		app.doSearch("redmi")
			.addToCart("redmi");
		
		app.payment("rrrrrrrrrrrrrrrrrrr");
		

	}

}
