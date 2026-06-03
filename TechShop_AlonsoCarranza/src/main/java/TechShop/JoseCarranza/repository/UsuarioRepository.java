package TechShop.JoseCarranza.repository;

import TechShop.JoseCarranza.domain.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
    public List<Usuario> findByActivoTrue();
}

