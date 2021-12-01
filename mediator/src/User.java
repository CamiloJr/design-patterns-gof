public abstract class User {

    private String name;
    private Mediator mediator;

    public User(String name, Mediator mediator){
        this.name = name;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public abstract void sendMessage(String receiver, String message);
    public abstract void receiveMessage(String sender, String message);
}
