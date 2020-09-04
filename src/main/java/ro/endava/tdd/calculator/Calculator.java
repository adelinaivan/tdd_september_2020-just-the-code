package ro.endava.tdd.calculator;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    public int add(Integer a, Integer b) {
        return a + b;
    }

    public Integer multiply(Integer a, Integer b) {
        return a * b;
    }

}
