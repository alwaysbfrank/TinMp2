package edu.matera.tin.mp2.venues;

import edu.matera.tin.mp2.screenings.PersistentScreening;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VenueScreening {

    private LocalDateTime start;

    private String film;

    private String guests;

    public static VenueScreening from(PersistentScreening persistentScreening) {
        return VenueScreening.builder()
                .start(persistentScreening.getStart())
                .guests(persistentScreening.getGuests())
                .film(persistentScreening.getFilm().getTitle())
                .build();
    }
}
