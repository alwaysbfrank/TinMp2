package edu.matera.tin.mp2.venues;

import edu.matera.tin.mp2.films.Film;
import edu.matera.tin.mp2.films.FilmScreening;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VenueDetails {
    private Venue venue;
    private List<VenueScreening> screenings;
}
