public class Main {
    public static  void main(String[] args) {
        Window window = Window.Instance();
        window.pack();
        window.setVisible(true);

        Window window2 = Window.Instance();
        window2.pack();
        window2.setVisible(true);
    }
}
