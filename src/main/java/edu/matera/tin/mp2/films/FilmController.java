package edu.matera.tin.mp2.films;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/films")
@RequiredArgsConstructor
@Slf4j
public class FilmController {

    private final FilmService service;

    @GetMapping
    public List<Film> getFilms() {
        return service.getAllFilms();
    }

    @PostMapping
    public Film createNewFilm(@RequestBody @Valid NewFilm film) {
        log.info("Received request to create film {}", film);
        return service.createNewFilm(film);
    }

    @PutMapping("/{id}")
    public Film editFilm(@PathVariable Integer id,
                         @RequestBody @Valid NewFilm film) {
        log.info("Received request to edit film {}:{}", id, film);
        film.setId(id);
        return service.editFilm(id, film);
    }

    @DeleteMapping("/{id}")
    public List<Film> deleteFilm(@PathVariable Integer id) {
        return service.deleteFilm(id);
    }

    @GetMapping("/{id}")
    public FilmDetails getFilm(@PathVariable Integer id) {
        return service.getDetails(id);
    }
}
