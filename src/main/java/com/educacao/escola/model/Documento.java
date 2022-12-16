package com.educacao.escola.model;

import java.io.Serializable;
import java.time.LocalDate;

import com.educacao.escola.enums.TipoDocumentoEnum;
import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "documento")
@Data
public class Documento implements Serializable {
    
    private static final long serialVersionUID = 12L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private TipoDocumentoEnum tipo;

    private String numero;

    @Column(name = "orgao_emissor")
    private String orgaoEmissor;

    @Column(name = "data_emissao")
    private LocalDate dataEmissao;

    @ManyToOne
    @JoinColumn(name = "pessoa_id")
    @JsonBackReference
    private Pessoa pessoa;

}
