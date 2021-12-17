package edu.matera.tin.mp2.screenings;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ScreeningRepository extends JpaRepository<PersistentScreening, Integer> {
}
