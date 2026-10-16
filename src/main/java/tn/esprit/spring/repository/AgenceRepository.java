package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.entity.Agence;

public interface AgenceRepository extends JpaRepository<Agence,Long> {
}
