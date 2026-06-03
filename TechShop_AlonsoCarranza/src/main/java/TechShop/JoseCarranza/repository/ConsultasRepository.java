package TechShop.JoseCarranza.repository;

import TechShop.JoseCarranza.domain.Consultas;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultasRepository extends JpaRepository<Consultas, Integer>{
    public List<Consultas> findByRespondidaFalse();
}

