package tn.esprit.spring.Services;

import tn.esprit.spring.entity.Client;

import java.util.List;

public interface IClientService {
    Client creer (Client client);
    Client obtenirParId(Long id);
    List<Client> listerTous();
    Client mettreAjour(Client client);
    void supprimer(Long id);
}
