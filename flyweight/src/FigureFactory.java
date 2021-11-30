import java.util.HashMap;

public class FigureFactory {

    private static final HashMap<String, Figure> figures = new HashMap<String, Figure>();

    public static Figure getFigure(String name) {

        Figure figure = figures.get(name);

        if(figure == null) {
            switch (name) {
                case "ellipse filled":
                    figure = new Ellipse(true);
                    break;
                case "ellipse":
                    figure = new Ellipse(false);
                    break;
                case "line":
                    figure = new Line();
                    break;
            }

            figures.put(name, figure);
        }
        return figure;
    }
}
