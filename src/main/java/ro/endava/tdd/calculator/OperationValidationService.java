package ro.endava.tdd.calculator;

import org.springframework.stereotype.Service;

@Service
public class OperationValidationService {

    public void validate(AdditionContext additionContext) {
        additionContext.setIsValid(additionContext.getA() > 0 && additionContext.getB() > 0);
    }

    public void checkIsPositive(Integer value) {
        if (value < 0) {
            throw new RuntimeException("We were expecting this number to be positive.");
        }
    }

}
