package tn.esprit.spring.Services;

import tn.esprit.spring.entity.Equipement;

import java.util.List;

public interface IEquipementService {
    Equipement creer (Equipement equipement);
    Equipement obtenirParId(Long id);
    List<Equipement> listerTous();
    Equipement mettreAjour(Equipement equipement);
    void supprimer(Long id);
}
