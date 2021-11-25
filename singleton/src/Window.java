import java.awt.Dimension;
import javax.swing.JFrame;

public class Window extends JFrame {
    private static Window window = null;

    private Window(){
        setPreferredSize(new Dimension(640, 480));
    }

    public static Window Instance() {
        if (window == null)
            window = new Window();
        return window;
    }
}
