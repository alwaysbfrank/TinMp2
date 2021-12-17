package edu.matera.tin.mp2.venues;

import edu.matera.tin.mp2.screenings.PersistentScreening;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersistentVenue {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private Integer capacity;

    @OneToMany(mappedBy = "venue")
    private Set<PersistentScreening> screenings;
}
