public class Main {
    public static void main(String[] args) {

        Tree christmasTree = new ChristmasTree();

        christmasTree = new ChristmasStar(christmasTree);
        christmasTree = new ChristmasBall(christmasTree);
        christmasTree = new ChristmasBall(christmasTree);
        christmasTree = new ChristmasBall(christmasTree);
        christmasTree = new ChristmasBall(christmasTree);
        christmasTree = new BlinkingLights(christmasTree);

        christmasTree.showOrnaments();
    }
}
