package TechShop.JoseCarranza.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "ruta")
public class Ruta implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ruta")
    private Integer idRuta;

    @Column(unique = true, nullable = false, length = 100)
    @NotNull
    @Size(max = 100)
    private String path;

    @Column(length = 200)
    @Size(max = 200)
    private String descripcion;

    @Column(name = "activo")
    private Boolean activo;
}
