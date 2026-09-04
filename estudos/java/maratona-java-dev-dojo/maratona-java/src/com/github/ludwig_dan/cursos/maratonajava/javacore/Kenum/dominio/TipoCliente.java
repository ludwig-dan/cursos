package com.github.ludwig_dan.cursos.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    private final int CODIGO;
    private final String NOME_RELATORIO;

    TipoCliente(int CODIGO, String NOME_RELATORIO) {
        this.CODIGO = CODIGO;
        this.NOME_RELATORIO = NOME_RELATORIO;
    }

    public int getCODIGO() {
        return CODIGO;
    }

    public String getNOME_RELATORIO(){
        return NOME_RELATORIO;
    }

    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio){
        for (TipoCliente value : values()) {
            if(value.getNOME_RELATORIO().equals(nomeRelatorio)){
                return value;
            }
        }

        return null;
    }

    @Override
    public String toString() {
        return "TipoCliente{" +
                "CODIGO=" + CODIGO +
                ", NOME_RELATORIO='" + NOME_RELATORIO + '\'' +
                '}';
    }
}
