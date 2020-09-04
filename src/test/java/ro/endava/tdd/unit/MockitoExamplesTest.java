package ro.endava.tdd.unit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import ro.endava.tdd.calculator.AdditionContext;
import ro.endava.tdd.calculator.Calculator;
import ro.endava.tdd.calculator.OperationValidationService;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MockitoExamplesTest {

    @Mock
    private OperationValidationService operationValidationService;

    @Mock
    private Calculator calculator;

    @Test
    public void mockito_default_methods_with_return() {
        // returns 0
        assertThat(calculator.add(2, 3)).isEqualTo(0);

        // returns null
        assertThat(calculator.multiply(2, 3)).isEqualTo(0);

        // does nothing
        operationValidationService.checkIsPositive(3);
    }

    @Test
    public void mockito_when_and_return() {
        when(calculator.multiply(any(), any())).thenReturn(3);

        assertThat(calculator.multiply(3, 6)).isEqualTo(3);
    }

    @Test
    public void mockito_verify_examples() {
        calculator.add(2, 4);

        verify(calculator).add(any(), any());
        verify(calculator, times(0)).add(2, 6);
    }

    @Test
    public void mockito_matchers_example() {
        when(calculator.multiply(any(), eq(3))).thenReturn(3);
        assertThat(calculator.multiply(3, 6)).isEqualTo(0);
        assertThat(calculator.multiply(3, 3)).isEqualTo(3);
    }

    @Test(expected = RuntimeException.class)
    public void mockito_when_and_doThrow() {
        when(calculator.multiply(any(), any())).thenThrow(mock(RuntimeException.class));
        calculator.multiply(2, 3);
    }

    @Test(expected = RuntimeException.class)
    public void mockito_doThrow() {
        doThrow(mock(RuntimeException.class))
                .when(operationValidationService).checkIsPositive(3);

        operationValidationService.checkIsPositive(3);
    }

    @Test
    public void mockito_doAnswer() {
        doAnswer(invocation -> {
            AdditionContext contextToBeValidated = invocation.getArgument(0);
            contextToBeValidated.setIsValid(true);
            return contextToBeValidated;
        }).when(operationValidationService).validate(any(AdditionContext.class));

        AdditionContext additionContext = new AdditionContext(3, 4);
        operationValidationService.validate(additionContext);
        assertThat(additionContext.isValid()).isTrue();
    }

    @Test
    public void mockito_argumentCaptor() {
        ArgumentCaptor<Integer> firstArgumentCaptor = ArgumentCaptor.forClass(Integer.class);

        calculator.multiply(3, 4);

        verify(calculator).multiply(eq(3), firstArgumentCaptor.capture());
        assertThat(firstArgumentCaptor.getValue()).isEqualTo(4);
    }

}
