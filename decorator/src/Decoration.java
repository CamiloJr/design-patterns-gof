public abstract class Decoration extends Tree {

    private final Tree tree;

    public Decoration(Tree tree) {
        this.tree = tree;
    }

    public void showOrnaments() {
        tree.showOrnaments();
    }
}
