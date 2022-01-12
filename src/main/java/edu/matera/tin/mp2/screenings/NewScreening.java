package edu.matera.tin.mp2.screenings;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import edu.matera.tin.mp2.films.Film;
import edu.matera.tin.mp2.venues.Venue;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
@JsonIgnoreProperties({"id", "film", "venue"})
public class NewScreening extends Screening {
    @NotNull(message = "Należy wybrać film")
    private Integer filmId;

    @NotNull(message = "Należy wybrać salę")
    private Integer venueId;

    public NewScreening(Integer id, LocalDateTime start, String guests, Integer filmId, Integer venueId) {
        super();
        this.filmId = filmId;
        this.venueId = venueId;
        this.setId(id);
        this.setStart(start);
        this.setGuests(guests);
        var film = new Film();
        film.setId(filmId);
        this.setFilm(film);
        var venue = new Venue();
        venue.setId(venueId);
        this.setVenue(venue);
    }
}
