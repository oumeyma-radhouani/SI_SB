package tn.esprit.spring.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entity.Employe;
import tn.esprit.spring.repository.EmployeRepository;

import java.util.List;


@Service
@AllArgsConstructor
public class EmployeService implements IEmployeService{

EmployeRepository empRepo;

    @Override
    public Employe creer(Employe employe) {
        return empRepo.save(employe);
    }

    @Override
    public Employe obtenirParId(Long id) {
        return empRepo.findById(id).orElse(null);
    }

    @Override
    public List<Employe> listerTous() {
        return empRepo.findAll();
    }

    @Override
    public Employe mettreAjour(Employe employe) {
        return empRepo.save(employe);
    }

    @Override
    public void supprimer(Long id) {
        empRepo.deleteById(id);

    }
}
