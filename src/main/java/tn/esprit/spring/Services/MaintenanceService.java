package tn.esprit.spring.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entity.Maintenance;
import tn.esprit.spring.repository.MaintenanceRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class MaintenanceService implements IMaintenanceService {
    MaintenanceRepository maintenanceRepository;

    @Override
    public Maintenance creer(Maintenance maintenance) {
        return  maintenanceRepository.save(maintenance);
    }

    @Override
    public Maintenance obtenirParId(Long id) {
        return  maintenanceRepository.findById(id).orElse(null);
    }

    @Override
    public List<Maintenance> listerTous() {
        return  maintenanceRepository.findAll();
    }

    @Override
    public Maintenance mettreAjour(Maintenance maintenance) {
        return  maintenanceRepository.save(maintenance);
    }

    @Override
    public void supprimer(Long id) {
        maintenanceRepository.deleteById(id);

    }
}
