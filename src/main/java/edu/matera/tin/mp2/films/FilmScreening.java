package edu.matera.tin.mp2.films;

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
public class FilmScreening {

    private LocalDateTime start;

    private String venue;

    private String guests;

    public static FilmScreening from(PersistentScreening persistentScreening) {
        return FilmScreening.builder()
                .start(persistentScreening.getStart())
                .guests(persistentScreening.getGuests())
                .venue(persistentScreening.getVenue().getName())
                .build();
    }
}
