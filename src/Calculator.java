public class Calculator {

    protected double a;
    protected double b;
    protected String operation;

    public double calculate (){
        switch (operation){
            case "+":
                return a+b;
            case "*":
                return a*b;
            case "/":
                return a/b;
            case "-":
                return a-b;
            default:
                return (0);
        }
    }

    public String listOperations(){
        return ("+,-,*,/");

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
