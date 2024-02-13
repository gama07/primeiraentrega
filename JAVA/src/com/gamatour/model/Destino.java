package com.gamatour.model;

public class Destino {

private int idDestino;
private String nomeDestino;

public Destino() {
  super();
    }

 public Destino(String nomeDestino) {
        super();
        this.nomeDestino = nomeDestino;
    }

 public int getIdDestino() {
        return idDestino;
    }

 public void setIdDestino(int idDestino) {
        this.idDestino = idDestino;
    }

public String getNomeDestino() {
        return nomeDestino;
    }

public void setNomeDestino(String nomeDestino) {
        this.nomeDestino = nomeDestino;
    }

 @Override
    public String toString() {
        return "Destino: " + idDestino + "\nNome do Destino: " + nomeDestino;
    }
}

