package in.dassdazzer.builder;

public class Shop {

	public static void main(String[] args) {
		Phone p= new PhoneBuilder().setOs("Android").setBattery(3100).build();
		System.out.println(p);
	}

}
