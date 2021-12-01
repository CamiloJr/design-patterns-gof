public class Main {
    public static void main(String[] args) {

        Vector vector = new Vector(new BubbleSort());
        vector.sort();

        // It is not necessary to destroy an object and create it again
        // to define another sorting method. In this way it is possible to
        // define an ordering strategy
        vector.setAlgorithm(new MergeSort());
        vector.sort();

        vector.setAlgorithm(new QuickSort());
        vector.sort();
    }
}
