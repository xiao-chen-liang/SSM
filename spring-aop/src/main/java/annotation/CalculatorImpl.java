package annotation;

import org.springframework.stereotype.Component;

@Component
public class CalculatorImpl implements Calculator {
    @Override
    public int addInt(int i, int j) {
        int result = i + j;
        System.out.println("方法内部result: " + result);
        return result;
    }

    @Override
    public int subtractInt(int i, int j) {
        int result = i - j;
        System.out.println("方法内部result: " + result);
        return result;
    }

    @Override
    public int multiplyInt(int i, int j) {
        int result = i * j;
        System.out.println("方法内部result: " + result);
        return result;
    }

    @Override
    public int divideInt(int i, int j) {
        int result = i / j;
        System.out.println("方法内部result: " + result);
        return result;
    }
}
