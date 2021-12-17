package edu.matera.tin.mp2.films;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Film {
    private Integer id;

    private String title;

    private String director;

    private Integer length;
}
