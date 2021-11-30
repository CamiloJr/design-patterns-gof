public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Invoker invoker = new Invoker();

        invoker.compute(new Sum(calculator, 10));
        invoker.compute(new Sum(calculator, 5));
        invoker.compute(new Sum(calculator, 10));

        invoker.undo(2);
    }
}
