package ro.endava.tdd.validation;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Before;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class SuperComplexDtoValidationTest {

    private Validator validator;

    @Before
    public void setUp() {
        validator = Validation.buildDefaultValidatorFactory().getValidator();

    }

    @Test
    public void test_validate_whenObjectIsValid_returnsNoViolations() {
        // Arrange
        SuperComplexDto superComplex = aValidSuperComplexDto();

        // Act
        Set<ConstraintViolation<SuperComplexDto>> constraintViolations = validator.validate(superComplex);

        // Assert
        assertThat(constraintViolations).isEmpty();
    }

    @Test
    public void test_validate_whenMandatoryIsMissing_returnsViolation() {
        // Arrange
        SuperComplexDto superComplex = aValidSuperComplexDto();
        superComplex.setMandatory(null);

        // Act
        Set<ConstraintViolation<SuperComplexDto>> constraintViolations = validator.validate(superComplex);

        // Assert
        assertThat(constraintViolations.size()).isEqualTo(1);
    }

    @Test
    public void test_validate_whenOptionalExceeds2000Characters_returnsViolation() {
        // Arrange
        SuperComplexDto superComplex = aValidSuperComplexDto();
        superComplex.setOptionalText(RandomStringUtils.random(2001));

        // Act
        Set<ConstraintViolation<SuperComplexDto>> constraintViolations = validator.validate(superComplex);

        // Assert
        assertThat(constraintViolations.size()).isEqualTo(1);
    }

    private SuperComplexDto aValidSuperComplexDto() {
        SuperComplexDto superComplexDto = new SuperComplexDto();
        superComplexDto.setMandatory(RandomStringUtils.random(20));
        superComplexDto.setOptionalText(RandomStringUtils.random(200));
        return superComplexDto;
    }
}
