package factorymethodpattern;

public class Main {

	public static void main(String[] args) {
		
		MobileFactory mobileFactory = new MobileFactory();
		Mobile mobile = MobileFactory.createMobile("IPHONE");
		mobile.createMobile();
		
		mobile = mobileFactory.createMobile("ONEPLUS");
		mobile.createMobile();
		
		mobile = mobileFactory.createMobile("REALME");
		mobile.createMobile();

	}

}
