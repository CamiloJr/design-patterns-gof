import java.util.ArrayList;
import java.util.Hashtable;

public class ChatMediator extends Mediator {

    private Hashtable<String, User> users = new Hashtable<String, User>();
    private ArrayList<String> forbiddenWords = new ArrayList<String>();

    public ChatMediator() {
        forbiddenWords.add("xxx");
        forbiddenWords.add("fk");
        forbiddenWords.add("zzz");
    }

    public void joinUser(User user) {
        if(!users.containsKey(user.getName())) {
            users.put(user.getName(), user);
        } else {
            System.out.println("User with that name has already been registered. Try another one!");
        }
    }

    public void sendMessage(String sender, String receiver, String message) {

        if(users.containsKey(sender) && users.containsKey(receiver)){
            User senderUser = users.get(sender);
            User receiverUser = users.get(receiver);

            for(String forbidden : forbiddenWords) {
                if(message.contains(forbidden)) {
                    senderUser.receiveMessage("Mediator", "You wrote a message with a prohibited word. " +
                                                                         "The message was not sent to the recipient.");
                    return;
                }
            }
            receiverUser.receiveMessage(sender, message);
        }
    }
}
