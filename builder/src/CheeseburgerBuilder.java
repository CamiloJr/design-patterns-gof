public class CheeseburgerBuilder extends HamburguerBuilder {

    private Hamburguer hamburguer = new Cheeseburger();

    public void cutBread() {
        System.out.println("Cut the cheeseburger bread...");
    }

    public void openBread() {
        System.out.println("Open the cheeseburger bread...");
    }

    public void insertIngredients() {
        System.out.println("Insert the ingredients of cheeseburger...");
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
