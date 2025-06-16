package Les1;

public class LambdaInterfaceMainApp {
    public static void main(String[] args) {
        //Lambda expressionnto implement the functional interface. This interface by default implements abstractFunction()

        LambdaInterface expression = (int x)-> System.out.println(2*x);

        // This calls above lambda expression and prints 2 times our input.

        expression.abstractFunction(5);
    }
}
