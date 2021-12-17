package edu.matera.tin.mp2.screenings;

import edu.matera.tin.mp2.NoElementFoundException;
import edu.matera.tin.mp2.OrikaMapper;
import edu.matera.tin.mp2.venues.NewVenue;
import edu.matera.tin.mp2.venues.Venue;
import edu.matera.tin.mp2.venues.VenueRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ScreeningService {
    
    private final OrikaMapper mapper;
    private final ScreeningRepository repository;
    
    public List<Screening> getAllScreenings() {
        return repository.findAll().stream().map(mapper::map).collect(Collectors.toList());
    }

    public Screening createNewScreening(NewScreening newScreening) {
        return saveScreening(newScreening);
    }

    public Screening editScreening(Integer id, NewScreening editedScreening) {
        editedScreening.setId(id);
        return saveScreening(editedScreening);
    }

    private Screening saveScreening(NewScreening editedScreening) {
        var forPersistence = mapper.map(editedScreening);
        var edited = repository.save(forPersistence);
        return mapper.map(edited);
    }

    public List<Screening> deleteScreening(Integer id) {
        repository.findById(id).ifPresent(repository::delete);
        return getAllScreenings();
    }

    public Screening get(Integer id) {
        return repository.findById(id).map(mapper::map).orElseThrow(NoElementFoundException::new);
    }
}
