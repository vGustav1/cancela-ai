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
import jakarta.validation.constraints.Email;

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

    @Email(message = "E-mail inválido", regexp = ".+@.+\\..+")
    @NotBlank(message = "O email é obrigatório")
    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private Boolean ativo = true;


    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getNomeServico(){
        return nomeServico;
    }

    public void setNomeServico(String nomeServico){
        this.nomeServico = nomeServico;
    }

    public BigDecimal getValor(){
        return valor;
    }

    public void setValor(BigDecimal valor){
        this.valor = valor;
    }

    public LocalDate getDataVencimento(){
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento){
        this.dataVencimento = dataVencimento;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public Boolean getAtivo(){
        return ativo;
    }

    public void setAtivo(Boolean ativo){
        this.ativo = ativo;   
    }
}

