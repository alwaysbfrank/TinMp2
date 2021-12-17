package edu.matera.tin.mp2.films;

import ma.glasnost.orika.BoundMapperFacade;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.stereotype.Component;

@Component
public class FilmMapper {

    private final BoundMapperFacade<Film, PersistentFilm> to;
    private final BoundMapperFacade<PersistentFilm, Film> from;

    public FilmMapper() {
        var mapperFactory = new DefaultMapperFactory.Builder().build();
        mapperFactory.classMap(Film.class, PersistentFilm.class);
        mapperFactory.classMap(PersistentFilm.class, Film.class);
        to = mapperFactory.getMapperFacade(Film.class, PersistentFilm.class);
        from = mapperFactory.getMapperFacade(PersistentFilm.class, Film.class);
    }

    public PersistentFilm map(Film film) {
        return to.map(film);
    }

    public Film map(PersistentFilm persistentFilm) {
        return from.map(persistentFilm);
    }
}
