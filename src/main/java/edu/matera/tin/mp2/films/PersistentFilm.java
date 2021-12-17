package edu.matera.tin.mp2.films;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
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
}
