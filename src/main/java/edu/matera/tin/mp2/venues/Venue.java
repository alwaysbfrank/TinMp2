package edu.matera.tin.mp2.venues;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Venue {
    private Integer id;

    @NotNull(message = "Nazwa sali nie może być pusta")
    @Length(min = 2, max = 60, message = "Nazwa sali musi mieć między 2 a 60 znaków")
    private String name;

    @NotNull(message = "Pojemność sali nie może być pusta")
    @Min(value = 1, message = "Pojemność sali musi być większa od 0")
    private Integer capacity;
}
