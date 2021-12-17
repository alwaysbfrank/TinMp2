package edu.matera.tin.mp2.venues;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersistentVenue {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private Integer capacity;
}
