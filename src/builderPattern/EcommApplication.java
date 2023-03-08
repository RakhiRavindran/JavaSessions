package builderPattern;

public class EcommApplication {

	public EcommApplication login(String userName,String password) {
		System.out.println("loged in using username and password");
		return this;		
	}
	
	public EcommApplication doSearch(String productName) {
		System.out.println(productName);
		return this;
	}
	
	public EcommApplication addToCart(String productName) {
		System.out.println("product added to cart");
		return this;
	}
	
	public EcommApplication payment(String upi) {
		System.out.println("Payment successful");
		return this;
	}
	
	public EcommApplication payment(int CVV, String cc) {
		System.out.println("Payment successful");
		return this;
	}
	
	

}
