import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Calculator basic = new Calculator();

        Scanner s = new Scanner(System.in);

        System.out.println("Supported operations are: " + basic.listOperations());
        System.out.println("Enter expression in format <a> <operation> <b>");

        basic.setA(s.nextDouble());
        basic.setOperation(s.next());
        basic.setB(s.nextDouble());

        System.out.println("Result is:" + basic.calculate());
    }
}
