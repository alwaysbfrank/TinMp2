package edu.matera.tin.mp2.screenings;

import edu.matera.tin.mp2.venues.NewVenue;
import edu.matera.tin.mp2.venues.Venue;
import edu.matera.tin.mp2.venues.VenueService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/screenings")
@RequiredArgsConstructor
public class ScreeningController {

    private final ScreeningService service;

    @GetMapping
    public List<Screening> getScreenings() {
        return service.getAllScreenings();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Screening createNewScreening(@RequestBody NewScreening screening) {
        return service.createNewScreening(screening);
    }

    @PutMapping("/{id}")
    public Screening editScreening(@PathVariable Integer id,
                         @RequestBody NewScreening screening) {
        screening.setId(id);
        return service.editScreening(id, screening);
    }

    @DeleteMapping("/{id}")
    public List<Screening> deleteScreening(@PathVariable Integer id) {
        return service.deleteScreening(id);
    }

    @GetMapping("/{id}")
    public Screening getScreening(@PathVariable Integer id) {
        return service.get(id);
    }
}
