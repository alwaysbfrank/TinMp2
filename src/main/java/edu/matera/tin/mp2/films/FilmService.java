package edu.matera.tin.mp2.films;

import edu.matera.tin.mp2.NoElementFoundException;
import edu.matera.tin.mp2.OrikaMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class FilmService {

    private final OrikaMapper mapper;
    private final FilmRepository repository;

    public List<Film> getAllFilms() {
        return repository.findAll().stream().map(mapper::map).collect(Collectors.toList());
    }

    public Film createNewFilm(NewFilm newFilm) {
        return saveFilm(newFilm);
    }

    public Film editFilm(Integer id, NewFilm editedFilm) {
        editedFilm.setId(id);
        return saveFilm(editedFilm);
    }

    private Film saveFilm(NewFilm editedFilm) {
        var forPersistence = mapper.map(editedFilm);
        var edited = repository.save(forPersistence);
        return mapper.map(edited);
    }

    public List<Film> deleteFilm(Integer id) {
        repository.findById(id).ifPresent(repository::delete);
        return getAllFilms();
    }

    public FilmDetails getDetails(Integer id) {
        var found = repository.findById(id).orElseThrow(NoElementFoundException::new);

        var film = mapper.map(found);
        var screenings = found.getScreenings().stream().map(FilmScreening::from).collect(Collectors.toList());

        return FilmDetails.builder()
                .film(film)
                .screenings(screenings)
                .build();
    }
}
