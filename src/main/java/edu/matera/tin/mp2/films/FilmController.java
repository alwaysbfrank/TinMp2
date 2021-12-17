package edu.matera.tin.mp2.films;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/films")
@RequiredArgsConstructor
public class FilmController {

    private final FilmService repository;

    @GetMapping
    public List<Film> getFilms() {
        return repository.getAllFilms();
    }

    @PostMapping
    public Film createNewFilm(@RequestBody NewFilm film) {
        return repository.createNewFilm(film);
    }

    @PutMapping("/{id}")
    public Film editFilm(@PathVariable Integer id,
                         @RequestBody NewFilm film) {
        film.setId(id);
        return repository.editFilm(id, film);
    }
}
