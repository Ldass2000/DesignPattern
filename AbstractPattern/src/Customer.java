import abstractpattern.factory.IPhoneFactory;
import abstractpattern.factory.OnePlusFactory;
import abstractpattern.factory.PhoneStore;

public class Customer {

	public static void main(String[] args) {
		PhoneStore iphone = new IPhoneFactory();
		iphone.orderPhone("iphone12");
		
		System.out.println("--------------------------------------------------------");
		
		PhoneStore oneplus = new OnePlusFactory();
		oneplus.orderPhone("Oneplus9");

	}

}
