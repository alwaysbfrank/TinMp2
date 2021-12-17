package edu.matera.tin.mp2;

import edu.matera.tin.mp2.films.Film;
import edu.matera.tin.mp2.films.PersistentFilm;
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
}
