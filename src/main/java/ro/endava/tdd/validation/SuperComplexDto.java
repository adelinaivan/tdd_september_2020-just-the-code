package ro.endava.tdd.validation;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class SuperComplexDto {

    @NotNull
    @Size(min = 1, max = 20)
    public String mandatory;

    @Size(min = 1, max = 200)
    public String optionalText;

    public String getOptionalText() {
        return optionalText;
    }

    public void setOptionalText(String optionalText) {
        this.optionalText = optionalText;
    }

    public String getMandatory() {
        return mandatory;
    }

    public void setMandatory(String mandatory) {
        this.mandatory = mandatory;
    }
}
