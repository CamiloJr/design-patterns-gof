public class Main {
    public static void main(String[] args) {
        Figure figure = FigureFactory.getFigure("line");
        figure.drawing("red");
        figure.drawing("black");

        figure = FigureFactory.getFigure("ellipse filled");
        figure.drawing("green");
    }
}
