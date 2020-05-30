import javax.validation.ConstraintValidator;

public @interface AccValidator {

    public class AccValidator implements ConstraintValidator<AccNumber, Integer> {

    }
}
