package edu.matera.tin.mp2.screenings;

import edu.matera.tin.mp2.films.Film;
import edu.matera.tin.mp2.venues.Venue;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Screening {

    private Integer id;

    private Film film;

    private Venue venue;

    private LocalDateTime start;

    private String guests;
}
