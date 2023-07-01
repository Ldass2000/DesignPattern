package abstractpattern.factory;

import abstractpattern.phone.Phone;

public abstract class PhoneStore {
	
      public Phone orderPhone(String modelName) {
    	  Phone phone;
    	  phone = createPhone(modelName);
    	  phone.buildPhone();
    	  phone.assemblephone();
    	  phone.packPhoneInBox();
    	  
		  return phone;
      }
      
      abstract Phone  createPhone(String modelName);
}
