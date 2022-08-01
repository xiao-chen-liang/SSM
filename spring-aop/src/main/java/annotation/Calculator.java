package annotation;

import org.springframework.stereotype.Component;

@Component
public interface Calculator {
    int addInt(int i, int j);

    int subtractInt(int i, int j);

    int multiplyInt(int i, int j);

    int divideInt(int i, int j);
}
