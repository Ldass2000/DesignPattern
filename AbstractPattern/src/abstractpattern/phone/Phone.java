package abstractpattern.phone;

public abstract  class Phone {
     String brand;
     String modelName;
     String bodyType;
     String phoneSize;
     
     public void buildPhone() {
    	 System.out.println("Building phone of brand :"+brand);
    	 System.out.println("phone mode is :"+modelName);
    	 System.out.println("Size of phone is :"+phoneSize);
    	 System.out.println("Body type phone is :"+bodyType);
     }
     
     public void assemblephone() {
    	 System.out.println("Assembleing all parts of phone");
     }
     
     public void packPhoneInBox() {
    	 System.out.println("Packing of phone");
     }
}
