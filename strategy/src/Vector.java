public class Vector {

    private SortingAlgorithm sortingAlgorithm;

    public Vector(SortingAlgorithm sortingAlgorithm) {
        this.sortingAlgorithm = sortingAlgorithm;
    }

    public void setAlgorithm(SortingAlgorithm sortingAlgorithm) {
        this.sortingAlgorithm = sortingAlgorithm;
    }

    public void sort() {
        sortingAlgorithm.sort();
    }
}
