package edu.matera.tin.mp2.films;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Film {
    private Integer id;

    @NotNull(message = "pole 'tytuł' musi być wypełnione")
    @Size(min = 2, max = 60, message = "Pole 'tytuł' musi mieć od 2 do 60 znaków")
    private String title;

    @NotNull(message = "pole 'reżyser' musi być wypełnione")
    @Size(min = 2, max = 60, message = "Pole 'reżyser' musi mieć od 2 do 60 znaków")
    private String director;

    @NotNull(message = "pole 'długość' musi być wypełnione")
    private Integer length;
}
