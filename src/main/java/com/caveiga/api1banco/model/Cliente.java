package com.caveiga.api1banco.model;

public class Cliente {
    private Long id;
    private String nome;
    private Long telefone;
    private Boolean correntista;
    private Float score_credito;
    private Float saldo_cc;

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Long getTelefone(){
        return telefone;
    }

    public void setTelefone(Long telefone){
        this.telefone = telefone;
    }

    public Boolean getCorrentista(){
        return correntista;
    }

    public void setCorrentista(Boolean correntista){
        this.correntista = correntista;
    }

    public Float getScore_credito(){
        return score_credito;
    }

    public void setScore_credito(Float score_credito){
        this.score_credito = score_credito;
    }

    public Float getSaldo_cc(){
        return saldo_cc;
    }

    public void setSaldo_cc(Float saldo_cc){
        this.saldo_cc = saldo_cc;
    }
}
