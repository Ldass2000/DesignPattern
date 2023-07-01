package abstractpattern.factory;

import abstractpattern.phone.IPhone12;
import abstractpattern.phone.IPhone13;
import abstractpattern.phone.Phone;

public class IPhoneFactory  extends PhoneStore{
	@Override
    Phone createPhone(String modelName) {
  	  
  	  if(modelName.equals("iphone12")) {
  		  return new IPhone12();
  	  }else if(modelName.equals("iphone13")) {
  		  return new IPhone13();
  	  }
  	  return null;
    }
}
