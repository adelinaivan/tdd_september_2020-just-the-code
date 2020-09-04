package ro.endava.tdd.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MultiplicationService {

    @Autowired
    private Calculator calculator;

    @Autowired
    private OperationValidationService operationValidationService;

    /**
     * must tell us what a * b is
     * throws exception if either a or be are negative
     */
    public Integer multiply(Integer a, Integer b) {
        operationValidationService.checkIsPositive(a);
        operationValidationService.checkIsPositive(b);

        return calculator.multiply(a, b);
    }
}
