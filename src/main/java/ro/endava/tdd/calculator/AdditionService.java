package ro.endava.tdd.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdditionService {

    private Calculator calculator;

    private OperationValidationService operationValidationService;

    @Autowired
    public AdditionService(Calculator calculator, OperationValidationService operationValidationService) {
        this.calculator = calculator;
        this.operationValidationService = operationValidationService;
    }

    /**
     * must tell us what a + b is
     * throws exception if either a or be are negative
     */
    public Integer add(Integer a, Integer b) {
        AdditionContext additionContext = new AdditionContext(a,b);
        operationValidationService.validate(additionContext);

        if(additionContext.isValid()) {
            return calculator.add(a, b);
        } else {
            throw new RuntimeException("Add parameters are invalid. You guess which. :P");
        }
    }

}
