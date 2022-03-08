import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Calculator c = null ;

        Scanner s = new Scanner(System.in);

        System.out.println("Welcome to great Calculator!\n" +
                "Which calculator do you need?\n" +
                "1 - Basic calculcator\n2 - Advanced calculator");

        if (s.nextInt() == 1) {
            c = new Calculator();
        } else {
            c = new AdvancedCalculator();
        }

        System.out.println("Supported operations are: " + c.listOperations());
        System.out.println("Enter expression in format <a> <operation> <b>");

        c.setA(s.nextDouble());
        c.setOperation(s.next());
        c.setB(s.nextDouble());

        System.out.println("Result is:" + c.calculate());
    }
}
