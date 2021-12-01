import java.util.Observable;
import java.util.Observer;

public class PoliceCar implements Observer, Car {

    public void go() {
        System.out.println("Police car moves on!");
    }

    public void left() {
        System.out.println("Police car turn left!");
    }

    public void right() {
        System.out.println("Police car turn right!");
    }

    public void stop() {
        System.out.println("Police car stopped!");
    }

    public void update(Observable o, Object arg) {
        StolenCar stolenCar = (StolenCar) o;
        String action = String.valueOf(arg);

        switch (action){
            case "go":
                this.go();
                break;
            case "left":
                this.left();
                break;
            case "right":
                this.right();
                break;
            case "stop":
                this.stop();
                break;
        }
    }
}
