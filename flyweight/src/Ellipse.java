public class Ellipse extends Figure {

    private boolean fill;

    public Ellipse(boolean fill) {
        super();
        this.fill = fill;
    }
    public void drawing(String color) {
        if(fill) {
            System.out.println("Ellipse Filled Figure. Color: " + color);
        }
        else {
            System.out.println("Ellipse Figure. Color: " + color);
        }
    }
}
