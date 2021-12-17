package edu.matera.tin.mp2.venues;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Venue {
    private Integer id;

    private String name;

    private Integer capacity;
}
