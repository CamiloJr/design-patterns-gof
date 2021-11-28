public class ConcreteImage extends Image {

    public ConcreteImage(String filenamea) {
        this.filename = filenamea;
        loadImagenFromDisk();
    }

    public void loadImagenFromDisk() {
        System.out.println("Loading " + filename + "...");
    }

    public void displayImage() {
        System.out.println("Displaying " + filename);
    }
}
