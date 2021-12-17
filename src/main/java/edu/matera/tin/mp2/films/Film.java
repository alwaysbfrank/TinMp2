package edu.matera.tin.mp2.films;

import edu.matera.tin.mp2.screenings.PersistentScreening;
import edu.matera.tin.mp2.screenings.Screening;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Film {
    private Integer id;

    private String title;

    private String director;

    private Integer length;
}
