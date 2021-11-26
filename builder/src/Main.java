public class Main {
    public static void main(String[] args) {

        Kitchen kitchen = new Kitchen();

        HamburguerBuilder cheeseburgerBuilder = new CheeseburgerBuilder();
        HamburguerBuilder chickenburgerBuilder = new ChickenburgerBuilder();

        kitchen.makeHamburger(cheeseburgerBuilder);
        Hamburguer cheeseburger = cheeseburgerBuilder.getHamburguer();

        kitchen.makeHamburger(chickenburgerBuilder);
        Hamburguer chickenburger = chickenburgerBuilder.getHamburguer();
    }
}
