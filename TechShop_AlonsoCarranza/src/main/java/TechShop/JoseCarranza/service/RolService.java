package TechShop.JoseCarranza.service;

import TechShop.JoseCarranza.domain.Rol;
import TechShop.JoseCarranza.repository.RolRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RolService {

    private final RolRepository rolRepository;

    public RolService(RolRepository rolRepository) {
        this.rolRepository = rolRepository;
    }

    @Transactional(readOnly = true)
    public List<Rol> getRoles(boolean activo) {
        if (activo) {
            return rolRepository.findByActivoTrue();
        }
        return rolRepository.findAll();
    }
}

