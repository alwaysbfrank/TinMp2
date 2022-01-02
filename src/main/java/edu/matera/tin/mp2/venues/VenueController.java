package edu.matera.tin.mp2.venues;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/venues")
@RequiredArgsConstructor
public class VenueController {

    private final VenueService service;

    @GetMapping
    public List<Venue> getVenues() {
        return service.getAllVenues();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Venue createNewVenue(@RequestBody @Valid NewVenue venue) {
        return service.createNewVenue(venue);
    }

    @PutMapping("/{id}")
    public Venue editVenue(@PathVariable Integer id,
                           @RequestBody @Valid NewVenue venue) {
        venue.setId(id);
        return service.editVenue(id, venue);
    }

    @DeleteMapping("/{id}")
    public List<Venue> deleteVenue(@PathVariable Integer id) {
        return service.deleteVenue(id);
    }

    @GetMapping("/{id}")
    public VenueDetails getVenue(@PathVariable Integer id) {
        return service.getDetails(id);
    }
}
