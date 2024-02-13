package com.gamatour.model;

import java.util.Date;

public class Passagens {

    private int idPassagem;
    private int idDestino;
    private int idCliente;
    private int idPromoção;
    private Date dataPartida; 
    private Date dataRetorno; 
    private double preçoPassagem;
    private int numPassageiros;

    public Passagens() {
        super();
    }

    public Passagens(int idDestino, int idCliente, int idPromoção, Date dataPartida, Date dataRetorno, double preçoPassagem, int numPassageiros) {
        super();
        this.idDestino = idDestino;
        this.idCliente = idCliente;
        this.idPromoção = idPromoção;
        this.dataPartida = dataPartida;
        this.dataRetorno = dataRetorno;
        this.preçoPassagem = preçoPassagem;
        this.numPassageiros = numPassageiros;
    }

    public int getIdPassagem() {
        return idPassagem;
    }

    public void setIdPassagem(int idPassagem) {
        this.idPassagem = idPassagem;
    }

    public int getIdDestino() {
        return idDestino;
    }

    public void setIdDestino(int idDestino) {
        this.idDestino = idDestino;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdPromoção() {
        return idPromoção;
    }

    public void setIdPromoção(int idPromoção) {
        this.idPromoção = idPromoção;
    }

    public Date getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(Date dataPartida) {
        this.dataPartida = dataPartida;
    }

    public Date getDataRetorno() {
        return dataRetorno;
    }

    public double getPreçoPassagem() {
        return preçoPassagem;
    }

    public void setPreçoPassagem(double preçoPassagem) {
        this.preçoPassagem = preçoPassagem;
    }

    public int getNumPassageiros() { 
        return numPassageiros;
    }

    public void setNumPassageiros(int numPassageiros) { 
        this.numPassageiros = numPassageiros;
    }

    @Override
    public String toString() {
        return "Passagem: " + idPassagem + "\nDestino: " + idDestino + "\nCliente: " + idCliente +
               "\nPromoção: " + idPromoção + "\nData de Partida: " + dataPartida + "\nData de Retorno: " + dataRetorno +
               "\nPreço da Passagem: " + preçoPassagem + "\nNúmero de Passageiros: " + numPassageiros;
    }

	


	public void setDataPartida(String dataPartidaStrAtualizada) {
		// TODO Auto-generated method stub
		
	}

	public void setDataRetorno(String dataRetornoStrAtualizada) {
		// TODO Auto-generated method stub
		
	}




}
