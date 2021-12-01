public class Duck extends Bird {

    private BirdBehavior birdFlyBehavior;
    private BirdBehavior birdCroakBehavior;

    public Duck() {
        this.birdFlyBehavior = new Fly();
        this.birdCroakBehavior = new Croak();
    }

    public void setFlyBehavior(BirdBehavior birdBehavior) {
        this.birdFlyBehavior = birdBehavior;
    }

    public void fly() {
        this.birdFlyBehavior.executeBehavior();
    }

    public void setCroakBehavior(BirdBehavior birdBehavior) {
        this.birdCroakBehavior = birdBehavior;
    }

    public void croak() {
        this.birdCroakBehavior.executeBehavior();;
    }
}
