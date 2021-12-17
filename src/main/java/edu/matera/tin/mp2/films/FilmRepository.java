package edu.matera.tin.mp2.films;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<PersistentFilm, Integer> {
}
