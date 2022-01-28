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

    @NotNull(message = "0010")
    @Length(min = 2, max = 60, message = "0011")
    private String name;

    @NotNull(message = "0012")
    @Min(value = 1, message = "0013")
    private Integer capacity;
}
