package edu.matera.tin.mp2.venues;

import edu.matera.tin.mp2.screenings.PersistentScreening;
import edu.matera.tin.mp2.screenings.Screening;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Venue {
    private Integer id;

    private String name;

    private Integer capacity;
}
