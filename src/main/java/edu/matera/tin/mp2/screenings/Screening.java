package edu.matera.tin.mp2.screenings;

import edu.matera.tin.mp2.films.Film;
import edu.matera.tin.mp2.venues.Venue;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Screening {

    private Integer id;

    private Film film;

    private Venue venue;

    @NotNull(message = "0006")
    @In20thCentury(message = "0007")
    private LocalDateTime start;

    private String guests;
}
