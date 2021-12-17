package edu.matera.tin.mp2.films;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class FilmService {

    private final FilmMapper mapper;
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
        var forPersistance = mapper.map(editedFilm);
        var edited = repository.save(forPersistance);
        return mapper.map(edited);
    }

    public List<Film> deleteFilm(Integer id) {
        repository.findById(id).ifPresent(repository::delete);
        return getAllFilms();
    }
}
