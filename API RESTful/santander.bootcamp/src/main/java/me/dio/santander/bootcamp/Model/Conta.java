package me.dio.santander.bootcamp.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity(name = "tb_conta")
@Data
public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String numero;

    private String agencia;

    @Column(scale = 13, precision = 2)
    private BigDecimal balance;

    @Column(name = "limite_disponivel", scale = 13, precision = 2)
    private BigDecimal limite;
}
