package edu.matera.tin.mp2.venues;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonIgnoreProperties("id")
@ToString(callSuper = true)
public class NewVenue extends Venue{
}
