public class Main {
    public static void main(String[] args) {
        PoliceCar policeCar = new PoliceCar();
        StolenCar stolenCar = new StolenCar();

        stolenCar.addObserver(policeCar);

        stolenCar.go();
        stolenCar.left();
        stolenCar.left();
        stolenCar.right();
        stolenCar.go();
        stolenCar.right();
        stolenCar.stop();
    }
}
