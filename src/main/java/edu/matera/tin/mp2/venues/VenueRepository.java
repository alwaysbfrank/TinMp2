package edu.matera.tin.mp2.venues;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VenueRepository extends JpaRepository<PersistentVenue, Integer> {
}
