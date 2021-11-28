public class ProxyImage extends Image {

    private ConcreteImage concreteImage;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    public void displayImage() {
        if(concreteImage == null)
            concreteImage = new ConcreteImage(filename);
        concreteImage.displayImage();
    }
}
