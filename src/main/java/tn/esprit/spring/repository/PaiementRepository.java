package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.entity.Paiement;

public interface PaiementRepository extends JpaRepository<Paiement,Long> {
}
