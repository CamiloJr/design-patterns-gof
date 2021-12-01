import java.util.Observable;

public class StolenCar extends Observable implements Car {

    public String action = "";

    public void go() {
        action = "go";
        System.out.println("Stolen car move on!");
        this.changeState();
    }

    public void left() {
        action = "left";
        System.out.println("Stolen car left life!");
        this.changeState();
    }

    public void right() {
        action = "right";
        System.out.println("Stolen car right life!");
        this.changeState();
    }

    public void stop() {
        action = "stop";
        System.out.println("Stolen car stop!");
        this.changeState();
    }

    public void changeState() {
        setChanged();
        notifyObservers(action);
    }
}
