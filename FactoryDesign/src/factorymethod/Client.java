package factorymethod;
/**
 * Factory : As name suggest it is factory where we can create objects.
 * Since it creates object it falls in creational design pattern
 * Factory pattern has  two important element in its design.
 *
 * 1. Interface/Abstract class : This is base element for which we are making factory i.e. 
 * we are going to get object of this type
 * In this case it is "OperatingSystem" which has type available Windows and Linux.
 *
 * 2. Factory : This will have nothing but Object creation logic. Let's say as a library you 
 * introduce one more subtype that is MacOperatingSystem. Now your caller is automatically 
 * extended this facility of third type , also we have taken responsibility of creating of object.
 *
 * In java this pattern is heavily used:
 * 1. Calendar.getInstance : Calendar is abstract class amd based on Locale and Timezone we provided it is giving calendar instance.
 * Note in this case we really don't know what type of calendar we got.
 * 2. In reflection Class.forname : the type of class you pass it gets loaded.
 *
 * Best link to learn java and patterns used : https://stackoverflow.com/questions/1673841/examples-of-gof-design-patterns-in-javas-core-libraries
 */

import factorymethod.message.Message;

public class Client {
	public static void main(String[] args) {
        printMessage(new JsonMessageCreator());
		printMessage(new TextMessageCreator());
	}
	
	public static void printMessage(MessageCreator creator ) {
		Message msg = creator.getMessage();
		System.out.println(msg);
	}
}
