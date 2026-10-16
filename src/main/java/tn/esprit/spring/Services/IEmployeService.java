package tn.esprit.spring.Services;

import tn.esprit.spring.entity.Employe;

import java.util.List;

public interface IEmployeService {

    Employe creer (Employe employe);
    Employe obtenirParId(Long id);
    List<Employe> listerTous();
    Employe mettreAjour(Employe employe);
    void supprimer(Long id);
}
