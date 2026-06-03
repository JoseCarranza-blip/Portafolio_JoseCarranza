package TechShop.JoseCarranza.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Integer idUsuario;

    @Column(nullable = false, length = 50)
    @NotNull
    @Size(max = 50)
    private String nombre;

    @Column(unique = true, nullable = false, length = 100)
    @NotNull
    @Size(max = 100)
    private String correo;

    @Column(nullable = false, length = 100)
    @NotNull
    @Size(max = 100)
    private String clave;

    @Column(name = "activo")
    private Boolean activo;
}

