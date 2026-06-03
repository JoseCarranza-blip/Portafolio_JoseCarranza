package TechShop.JoseCarranza.service;

import TechShop.JoseCarranza.domain.Consultas;
import TechShop.JoseCarranza.repository.ConsultasRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ConsultasService {

    private final ConsultasRepository consultasRepository;

    public ConsultasService(ConsultasRepository consultasRepository) {
        this.consultasRepository = consultasRepository;
    }

    @Transactional(readOnly = true)
    public List<Consultas> getConsultas(boolean respondida) {
        if (!respondida) {
            return consultasRepository.findByRespondidaFalse();
        }
        return consultasRepository.findAll();
    }
}
