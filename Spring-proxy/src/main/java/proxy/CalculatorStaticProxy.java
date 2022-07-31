package proxy;

public class CalculatorStaticProxy implements Calculator{

    private Calculator calculator;

    public CalculatorStaticProxy(Calculator calculator){
        this.calculator = calculator;
    }

    @Override
    public int addInt(int i, int j) {
        System.out.println("log, addInt(" + i + ", " + j + ")");
        int result = calculator.addInt(i, j);
        System.out.println("result"+result);
        return result;
    }

    @Override
    public int subtractInt(int i, int j) {
        System.out.println("log, addInt(" + i + ", " + j + ")");
        int result = calculator.subtractInt(i, j);
        System.out.println("result"+result);
        return result;
    }

    @Override
    public int multiplyInt(int i, int j) {
        System.out.println("log, addInt(" + i + ", " + j + ")");
        int result = calculator.multiplyInt(i, j);
        System.out.println("result"+result);
        return result;
    }

    @Override
    public int divideInt(int i, int j) {
        System.out.println("log, addInt(" + i + ", " + j + ")");
        int result = calculator.divideInt(i, j);
        System.out.println("result"+result);
        return result;
    }
}
