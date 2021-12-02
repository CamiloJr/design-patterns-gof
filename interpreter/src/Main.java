import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String roman = "MCMXXVIII";
        Context context = new Context(roman);

        ArrayList<Expression> tree = new ArrayList<Expression>();
        tree.add(new Thousands());
        tree.add(new Hundred());
        tree.add(new Dozens());
        tree.add(new Unit());

        // Interpreter
        for(Expression exp : tree) {
            exp.interpret(context);
        }

        System.out.println(context.getOutput());
    }
}
