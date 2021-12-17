package edu.matera.tin.mp2.films;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FilmDetails {
    private Film film;
    private List<FilmScreening> screenings;
}
