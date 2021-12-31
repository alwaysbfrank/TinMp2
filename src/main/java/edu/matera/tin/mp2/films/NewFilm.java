package edu.matera.tin.mp2.films;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonIgnoreProperties("id")
@ToString(callSuper = true)
public class NewFilm extends Film{
}
