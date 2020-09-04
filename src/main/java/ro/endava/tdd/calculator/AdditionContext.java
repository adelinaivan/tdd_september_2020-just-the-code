package ro.endava.tdd.calculator;

public class AdditionContext {

    private Integer a;

    private Integer b;

    private boolean isValid = true;

    public AdditionContext(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    public Integer getA() {
        return a;
    }

    public Integer getB() {
        return b;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setIsValid(boolean isValid) {
        this.isValid = isValid;
    }
}
