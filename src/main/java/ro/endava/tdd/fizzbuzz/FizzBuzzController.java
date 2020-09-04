package ro.endava.tdd.fizzbuzz;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fizzBuzz")
public class FizzBuzzController {

    @GetMapping
    public String printNumbers() {
        return "i don't know yet";
    }

}
