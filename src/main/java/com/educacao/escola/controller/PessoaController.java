package com.educacao.escola.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educacao.escola.model.Pessoa;
import com.educacao.escola.repository.PessoaRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/pessoa")
@AllArgsConstructor
public class PessoaController {
    
    private final PessoaRepository pessoaRepository;

    @GetMapping("/lista")
    public List<Pessoa> finPessoaById(){
        
        return pessoaRepository.findAll();
    }

}
