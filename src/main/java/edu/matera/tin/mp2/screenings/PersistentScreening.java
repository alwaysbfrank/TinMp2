package edu.matera.tin.mp2.screenings;

import edu.matera.tin.mp2.films.PersistentFilm;
import edu.matera.tin.mp2.venues.PersistentVenue;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PersistentScreening {
    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    @JoinColumn
    private PersistentFilm film;

    @ManyToOne
    @JoinColumn
    private PersistentVenue venue;

    private LocalDateTime start;
    private String guests;
}
