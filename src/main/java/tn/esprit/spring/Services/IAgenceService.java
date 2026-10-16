package tn.esprit.spring.Services;

import tn.esprit.spring.entity.Agence;
import tn.esprit.spring.entity.Employe;

import java.util.List;

public interface IAgenceService {
    Agence creer (Agence agence);
    Agence obtenirParId(Long id);
    List<Agence> listerTous();
    Agence mettreAjour(Agence agence);
    void supprimer(Long id);
}
