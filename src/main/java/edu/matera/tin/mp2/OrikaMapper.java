package edu.matera.tin.mp2;

import edu.matera.tin.mp2.films.Film;
import edu.matera.tin.mp2.films.FilmScreening;
import edu.matera.tin.mp2.films.PersistentFilm;
import edu.matera.tin.mp2.screenings.PersistentScreening;
import edu.matera.tin.mp2.screenings.Screening;
import edu.matera.tin.mp2.venues.PersistentVenue;
import edu.matera.tin.mp2.venues.Venue;
import edu.matera.tin.mp2.venues.VenueScreening;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.stereotype.Component;

@Component
public class OrikaMapper {

    private final MapperFactory mapperFactory;

    public OrikaMapper() {
        this.mapperFactory = new DefaultMapperFactory.Builder().build();
        mapperFactory.classMap(Film.class, PersistentFilm.class);
        mapperFactory.classMap(PersistentFilm.class, Film.class);
        mapperFactory.classMap(Venue.class, PersistentVenue.class);
        mapperFactory.classMap(PersistentVenue.class, Venue.class);
        mapperFactory.classMap(Screening.class, PersistentScreening.class);
        mapperFactory.classMap(PersistentScreening.class, Screening.class);
        mapperFactory.classMap(PersistentScreening.class, FilmScreening.class);
        mapperFactory.classMap(PersistentScreening.class, VenueScreening.class);
    }

    public <Source, Result> Result map(Source src, Class<Source> srcClass, Class<Result> resultClass) {
        return mapperFactory.getMapperFacade(srcClass, resultClass).map(src);
    }

    public Film map(PersistentFilm persistentFilm) {
        return map(persistentFilm, PersistentFilm.class, Film.class);
    }

    public PersistentFilm map(Film film) {
        return map(film, Film.class, PersistentFilm.class);
    }

    public Venue map(PersistentVenue persistentVenue) {
        return map(persistentVenue, PersistentVenue.class, Venue.class);
    }

    public PersistentVenue map(Venue venue) {
        return map(venue, Venue.class, PersistentVenue.class);
    }

    public Screening map(PersistentScreening persistentScreening) {
        return map(persistentScreening, PersistentScreening.class, Screening.class);
    }

    public PersistentScreening map(Screening screening) {
        return map(screening, Screening.class, PersistentScreening.class);
    }

    public FilmScreening mapToFilmScreening(PersistentScreening persistentScreening) {
        return map(persistentScreening, PersistentScreening.class, FilmScreening.class);
    }

    public VenueScreening mapToVenueScreeening(PersistentScreening persistentScreening) {
        return map(persistentScreening, PersistentScreening.class, VenueScreening.class);
    }
}
