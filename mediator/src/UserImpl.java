public class UserImpl extends User {

    public UserImpl(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void sendMessage(String receiver, String message) {
        Mediator mediator = this.getMediator();
        mediator.sendMessage(this.getName(), receiver, message);
    }

    public void receiveMessage(String sender, String message) {
        System.out.println("Sender: " + sender + "\n" + "  Message: " + message);
    }
}
