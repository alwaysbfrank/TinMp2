package edu.matera.tin.mp2.screenings;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;
import java.time.LocalDateTime;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = AfterValidator.class)
@Documented
public @interface In20thCentury {

    String message() default "{javax.validation.constraints.Past.message}"; //Default javax Pasr message

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
