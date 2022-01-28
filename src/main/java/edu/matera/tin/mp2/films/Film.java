package edu.matera.tin.mp2.films;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Film {
    private Integer id;

    @NotNull(message = "0001")
    @Size(min = 2, max = 60, message = "0002")
    private String title;

    @NotNull(message = "0003")
    @Size(min = 2, max = 60, message = "0004")
    private String director;

    @NotNull(message = "0005")
    @Min(value = 1, message = "0005")
    private Integer length;
}
