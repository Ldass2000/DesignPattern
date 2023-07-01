package abstractpattern.factory;

import abstractpattern.phone.OnePlus8;
import abstractpattern.phone.OnePlus9;
import abstractpattern.phone.Phone;

public class OnePlusFactory extends PhoneStore{
      @Override
      Phone createPhone(String modelName) {
    	  
    	  if(modelName.equals("Oneplus8")) {
    		  return new OnePlus8();
    	  }else if(modelName.equals("Oneplus9")) {
    		  return new OnePlus9();
    	  }
    	  return null;
      }
}
