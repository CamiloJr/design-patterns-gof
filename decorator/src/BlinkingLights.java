public class BlinkingLights extends Decoration {
    public BlinkingLights(Tree tree) {
        super(tree);
    }

    public void showOrnaments() {
        super.showOrnaments();
        System.out.print("Blinking Lights, ");
    }
}
