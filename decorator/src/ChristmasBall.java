public class ChristmasBall extends Decoration {
    public ChristmasBall(Tree tree) {
        super(tree);
    }

    public void showOrnaments() {
        super.showOrnaments();
        System.out.print("Christmas Ball, ");
    }
}
