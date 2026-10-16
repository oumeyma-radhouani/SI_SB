package tn.esprit.spring.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entity.Client;
import tn.esprit.spring.repository.ClientRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ClientService implements  IClientService {
    ClientRepository clientRepository;

    @Override
    public Client creer(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client obtenirParId(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public List<Client> listerTous() {
        return clientRepository.findAll();
    }

    @Override
    public Client mettreAjour(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public void supprimer(Long id) {
        clientRepository.deleteById(id);

    }
}
