package DIO.PadroesDeProjeto_ComSpring.Model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Endereco endereco;

    private String nome;
}
