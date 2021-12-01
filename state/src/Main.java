public class Main {
    public static void main(String[] args) {
        Duck duck = new Duck();

        duck.fly();
        duck.croak();

        duck.setFlyBehavior(new NotFly());

        duck.fly();
        duck.croak();
    }
}
