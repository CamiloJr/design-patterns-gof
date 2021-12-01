public class Main {
    public static void main(String[] args) {

        ChatMediator chatMediator = new ChatMediator();

        User paul = new UserImpl("Paul", chatMediator);
        User joseph = new UserImpl("Joseph", chatMediator);
        User willian = new UserImpl("Willian", chatMediator);
        User richard = new UserImpl("Richard", chatMediator);

        chatMediator.joinUser(paul);
        chatMediator.joinUser(joseph);
        chatMediator.joinUser(willian);
        chatMediator.joinUser(richard);

        paul.sendMessage("Willian", "Hello, Willian!");
        willian.sendMessage("Paul", "Hello!");

        willian.sendMessage("Joseph", "Joseph xxx");

        richard.sendMessage("Paul", "Hello, Paul!");
    }
}
