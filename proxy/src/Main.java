public class Main {

    public static void main(String[] args) {
        Image image1 = new ProxyImage("web-image-01");
        Image image2 = new ProxyImage("web-image-02");

        image1.displayImage();
        image2.displayImage();
        image2.displayImage();
    }
}
