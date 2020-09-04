package ro.endava.tdd.calculator;

import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Ignore
@RunWith(MockitoJUnitRunner.class)
public class MultiplicationServiceTest {

    private static Logger log = LoggerFactory.getLogger(MultiplicationServiceTest.class);

    @InjectMocks
    private MultiplicationService multiplicationService;

    @Mock
    private OperationValidationService operationValidationService;

}
