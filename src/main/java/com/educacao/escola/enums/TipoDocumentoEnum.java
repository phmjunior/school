package com.educacao.escola.enums;

public enum TipoDocumentoEnum {
    
    CPF("CPF"),
    CNH("CNH"),
    RG("RG"),
    OUTROS("OUTROS");
    
    private String descDocumento;

    private TipoDocumentoEnum(String  descDocumento){
        this.descDocumento = descDocumento;
    }

    public String getDescDocumento(){
        return descDocumento;
    }
}