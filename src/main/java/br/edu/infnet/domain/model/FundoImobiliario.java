package br.edu.infnet.domain.model;

import javax.persistence.Entity;

@Entity
public class FundoImobiliario extends Ativo{

    private String empresa;
    private float dividendo;
    private int risco;

    public FundoImobiliario(){

    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public float getDividendo() {
        return dividendo;
    }

    public void setDividendo(float dividendo) {
        this.dividendo = dividendo;
    }

    public int getRisco() {
        return risco;
    }

    public void setRisco(int risco) {
        this.risco = risco;
    }
}
