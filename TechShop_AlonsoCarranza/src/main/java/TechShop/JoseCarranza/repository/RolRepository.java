package TechShop.JoseCarranza.repository;

import TechShop.JoseCarranza.domain.Rol;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer>{
    public List<Rol> findByActivoTrue();
}

