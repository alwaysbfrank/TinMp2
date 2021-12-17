package edu.matera.tin.mp2.films;

import edu.matera.tin.mp2.screenings.PersistentScreening;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PersistentFilm {
    @Id
    @GeneratedValue
    private Integer id;

    private String title;

    private String director;

    private Integer length;

    @OneToMany(mappedBy = "film")
    private Set<PersistentScreening> screenings;
}
