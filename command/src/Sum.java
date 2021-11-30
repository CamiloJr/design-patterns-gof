public class Sum extends Command{

    private Calculator calculator;
    private int number;

    public Sum(Calculator calculator, int number) {
        this.calculator = calculator;
        this.number = number;
    }

    public void execute() {
        calculator.setValue(calculator.getValue() + number);
        System.out.println(calculator.getValue());
    }

    public void undo() {
        calculator.setValue(calculator.getValue() - number);
        System.out.println(calculator.getValue());
    }
}
