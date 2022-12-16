package com.educacao.escola.enums;

public enum PerfilPessoaEnum {
    
    ALUNO("ALUNO"),
    RESPONSAVEL("RESPONSAVEL"),    
    PROFESSOR("PROFESSOR"),
    SECRETARIA("SECRETARIA"),
    DIRETOR("DIRETORIA"),
    COORDENADOR("COORDENADOR");

    private String perfil;

    private PerfilPessoaEnum(String perfil){
        this.perfil = perfil;
    }

    public String getPerfil(){
        return perfil;
    }

}
