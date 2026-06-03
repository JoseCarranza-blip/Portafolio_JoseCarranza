package TechShop.JoseCarranza.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "rol")
public class Rol implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rol")
    private Integer idRol;

    @Column(unique = true, nullable = false, length = 50)
    @NotNull
    @Size(max = 50)
    private String nombre;

    @Column(name = "activo")
    private Boolean activo;
}
