package edu.matera.tin.mp2.venues;

import edu.matera.tin.mp2.OrikaMapper;
import edu.matera.tin.mp2.films.Film;
import edu.matera.tin.mp2.films.NewFilm;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class VenueService {
    
    private final OrikaMapper mapper;
    private final VenueRepository repository;
    
    public List<Venue> getAllVenues() {
        return repository.findAll().stream().map(mapper::map).collect(Collectors.toList());
    }

    public Venue createNewVenue(NewVenue newVenue) {
        return saveVenue(newVenue);
    }

    public Venue editVenue(Integer id, NewVenue editedVenue) {
        editedVenue.setId(id);
        return saveVenue(editedVenue);
    }

    private Venue saveVenue(NewVenue editedVenue) {
        var forPersistence = mapper.map(editedVenue);
        var edited = repository.save(forPersistence);
        return mapper.map(edited);
    }

    public List<Venue> deleteVenue(Integer id) {
        repository.findById(id).ifPresent(repository::delete);
        return getAllVenues();
    }
}
