package TechShop.JoseCarranza.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "consultas")
public class Consultas implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_consulta")
    private Integer idConsulta;

    @Column(length = 200)
    @Size(max = 200)
    private String asunto;

    @Column(length = 1024)
    @Size(max = 1024)
    private String mensaje;

    @Column(name = "respondida")
    private Boolean respondida;
}

