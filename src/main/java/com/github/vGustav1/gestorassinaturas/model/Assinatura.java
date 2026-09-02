package com.github.vGustav1.gestorassinaturas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;
import java.time.LocalDate;


@Entity
@Table(name = "assinaturas")
public class Assinatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome do serviço é obrigatório")
    @Column(nullable = false)
    private String nomeServico;

    @NotNull(message = "O valor é obrigatório")
    @Positive(message = "O valor deve ser maior que zero")
    @Column(nullable = false)
    private BigDecimal valor;

    @NotNull(message = "A data de vencimento é obrigatória")
    @Column(nullable = false)
    private LocalDate dataVencimento;

    @NotBlank(message = "O número do WhatsApp é obrigatório")
    @Column(nullable = false)
    private String numeroWhatsapp;

    @Column(nullable = false)
    private Boolean ativo = true;

}
