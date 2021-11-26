public class Kitchen {

    public void makeHamburger(HamburguerBuilder hamburguerBuilder)
    {
        hamburguerBuilder.cutBread();
        hamburguerBuilder.openBread();
        hamburguerBuilder.insertIngredients();
        hamburguerBuilder.closeBread();
    }
}
