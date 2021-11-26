public class ChickenburgerBuilder extends HamburguerBuilder {

    private Hamburguer hamburguer = new Chickenburger();

    public void cutBread() {
        System.out.println("Cut the chickenburge bread...");
    }

    public void openBread() {
        System.out.println("Open the chickenburge bread...");
    }

    public void insertIngredients() {
        System.out.println("Insert the ingredients of chickenburge...");
    }

    public void closeBread() {
        System.out.println("Close the bread with the ingredients.");
    }

    public Hamburguer getHamburguer()
    {
        System.out.println();
        return hamburguer;
    }
}
