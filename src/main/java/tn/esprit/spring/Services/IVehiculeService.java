package tn.esprit.spring.Services;

import tn.esprit.spring.entity.Vehicule;

import java.util.List;

public interface IVehiculeService {
    Vehicule creer (Vehicule vehicule);
    Vehicule obtenirParId(Long id);
    List<Vehicule> listerTous();
    Vehicule mettreAjour(Vehicule vehicule);
    void supprimer(Long id);
}
