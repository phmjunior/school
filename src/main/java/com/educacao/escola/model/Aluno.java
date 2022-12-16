package com.educacao.escola.model;

import java.io.Serializable;
import jakarta.persistence.*;
import lombok.RequiredArgsConstructor;

@Entity
@RequiredArgsConstructor
public class Aluno implements Serializable {
    

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;


}
