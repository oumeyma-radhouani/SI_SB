package tn.esprit.spring.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.Services.IClientService;
import tn.esprit.spring.entity.Client;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/client")
public class ClientController {
    IClientService clientService;

    @PostMapping("/addclient")
    public Client creer(@RequestBody Client client) {
        return clientService.creer(client);
    }

    @GetMapping("/getclient/{id}")
    public Client obtenirParId(@PathVariable Long id) {
        return clientService.obtenirParId(id);
    }

    @GetMapping("/clients")
    public List<Client> listerTous() {
        return clientService.listerTous();
    }

    @PutMapping("/mettreajourclient")
    public Client mettreAjour(@PathVariable Long id, @RequestBody Client client) {
        return clientService.mettreAjour(client);
    }

    @DeleteMapping("/deleteClient")

    public void supprimer(@PathVariable Long id) {
        clientService.supprimer(id);
    }
}
