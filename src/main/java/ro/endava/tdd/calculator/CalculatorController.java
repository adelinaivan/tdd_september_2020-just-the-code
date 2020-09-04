package ro.endava.tdd.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculate")
public class CalculatorController {

    private static Logger log = LoggerFactory.getLogger(CalculatorController.class);

    @Autowired
    private AdditionService additionService;

    @Autowired
    private MultiplicationService multiplicationService;

    @GetMapping(value = "/{a}/plus/{b}")
    public Integer add(@PathVariable Integer a, @PathVariable Integer b) {
        return additionService.add(a, b);
    }

    @GetMapping(value = "/{a}/multipliedBy/{b}")
    public Integer multiply(@PathVariable Integer a, @PathVariable Integer b) {
        return multiplicationService.multiply(a, b);
    }
}
