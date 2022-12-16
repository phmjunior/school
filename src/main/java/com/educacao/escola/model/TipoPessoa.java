package com.educacao.escola.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.educacao.escola.enums.PerfilPessoaEnum;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tipo_pessoa")
@Data
public class TipoPessoa implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private PerfilPessoaEnum perfil;

    /*@OneToMany(mappedBy = "tipoPessoa")
    private List<Pessoa> pessoas;*/
    
}
