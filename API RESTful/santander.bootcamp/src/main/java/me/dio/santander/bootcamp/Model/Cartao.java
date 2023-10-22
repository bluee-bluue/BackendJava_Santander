package me.dio.santander.bootcamp.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity(name = "tb_cartao")
@Data
public class Cartao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String numero;

    @Column(name = "limite_adicional", scale = 13, precision = 2)
    private BigDecimal limite;
}
