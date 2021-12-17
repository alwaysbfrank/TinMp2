package edu.matera.tin.mp2.films;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/films")
@RequiredArgsConstructor
public class FilmController {

    private final FilmService service;

    @GetMapping
    public List<Film> getFilms() {
        return service.getAllFilms();
    }

    @PostMapping
    public Film createNewFilm(@RequestBody NewFilm film) {
        return service.createNewFilm(film);
    }

    @PutMapping("/{id}")
    public Film editFilm(@PathVariable Integer id,
                         @RequestBody NewFilm film) {
        film.setId(id);
        return service.editFilm(id, film);
    }

    @DeleteMapping("/{id}")
    public List<Film> deleteFilm(@PathVariable Integer id) {
        return service.deleteFilm(id);
    }
}
