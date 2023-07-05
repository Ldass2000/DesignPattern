package mediatordesignpattern.chatting;
/**
 * Contract to Adding new User and 
 * sending message in group chat.
 */
public interface ChattingMediator {
	public abstract void sendMessage(String message,User user);
	public abstract void addUser(User user);
}
