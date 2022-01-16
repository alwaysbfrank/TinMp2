package edu.matera.tin.mp2.screenings;

import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;

@Component
public class AfterValidator implements ConstraintValidator<In20thCentury, TemporalAccessor> {

    @Override
    public void initialize(In20thCentury constraintAnnotation) {
    }

    @Override
    public boolean isValid(TemporalAccessor value, ConstraintValidatorContext context) {
        if(value==null){
            return true;
        }

        var year = value.get(ChronoField.YEAR);
        return year > 1900;
    }
}
