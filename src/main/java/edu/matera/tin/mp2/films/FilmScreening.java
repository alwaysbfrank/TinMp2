package edu.matera.tin.mp2.films;

import edu.matera.tin.mp2.screenings.PersistentScreening;
import edu.matera.tin.mp2.venues.Venue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FilmScreening {

    private LocalDateTime start;

    private Venue venue;

    private String guests;
}
