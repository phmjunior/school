package com.educacao.escola.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "pessoa")
@Data
public class Pessoa implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    @Column(name = "dt_nascimento")
    private LocalDate dtNascimento;

    @Column(name = "dt_cadastro")
    private LocalDate dtCadastro;
    
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "tipo_pessoa_id")
    private TipoPessoa tipoPessoa;

    @OneToMany(mappedBy = "pessoa", cascade = CascadeType.PERSIST)
    @JsonManagedReference
    private List<Contato> contatos = new ArrayList<>();

    @OneToMany(mappedBy = "pessoa", cascade = CascadeType.PERSIST)
    @JsonManagedReference
    private List<Documento> documentos = new ArrayList<>();

    @OneToMany(mappedBy = "pessoa", cascade = CascadeType.PERSIST)
    @JsonManagedReference
    private List<Endereco> enderecos = new ArrayList<>();


}
