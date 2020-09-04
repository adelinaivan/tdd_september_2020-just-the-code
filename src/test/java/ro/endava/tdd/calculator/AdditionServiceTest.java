package ro.endava.tdd.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class AdditionServiceTest {

    private static Logger log = LoggerFactory.getLogger(AdditionServiceTest.class);

    private AdditionService additionService;

    private OperationValidationService operationValidationService;

    @Test
    public void add() {
        operationValidationService = mock(OperationValidationService.class);
        doAnswer(invocation -> {
            AdditionContext contextToBeValidated = invocation.getArgument(0);
            contextToBeValidated.setIsValid(true);
            return contextToBeValidated;
        }).when(operationValidationService).validate(any(AdditionContext.class));
        additionService = new AdditionService(new Calculator(), operationValidationService);
        assertEquals(5, additionService.add(2, 3).intValue());
        assertEquals(8, additionService.add(2, 6).intValue());
        verify(operationValidationService, times(2)).validate(any(AdditionContext.class));
    }

    @Test(expected = RuntimeException.class)
    public void addThrowsException() {
        operationValidationService = mock(OperationValidationService.class);
        doAnswer(invocation -> {
            AdditionContext contextToBeValidated = invocation.getArgument(0);
            contextToBeValidated.setIsValid(false);
            return contextToBeValidated;
        }).when(operationValidationService).validate(any(AdditionContext.class));
        additionService = new AdditionService(new Calculator(), operationValidationService);
        additionService.add(2, 3);
    }
}
