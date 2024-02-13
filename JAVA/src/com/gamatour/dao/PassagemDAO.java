package com.gamatour.dao;

import java.sql.Connection;
import java.sql.Date;

import com.gamatour.model.Passagens;

public class PassagemDAO {

    private int idPassagem;
    private int idDestino;
    private int idCliente;
    private int idPromoção;
    private Date dataPartida;
    private Date dataRetorno; 
    private double preçoPassagem;
    private int numPassageiros;

    public PassagemDAO(Connection connection) {
        super();
    }

    public PassagemDAO(int idDestino, int idCliente, int idPromoção, Date dataPartida, Date dataRetorno, double preçoPassagem, int numPassageiros) {
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

    public void setDataPartida(Date localDate) {
        this.dataPartida = localDate;
    }

    public Date getDataRetorno() {
        return dataRetorno;
    }

    public void setDataRetorno(Date localDate) {
        this.dataRetorno = localDate;
    }

    public double getPreçoPassagem() {
        return preçoPassagem;
    }

    public void setPreçoPassagem(double preçoPassagem) {
        this.preçoPassagem = preçoPassagem;
    }

    public int getnumPassageiros() {
        return numPassageiros;
    }

    public void setnumPassageiros(int numPassageiros) {
        this.numPassageiros = numPassageiros;
    }

    @Override
    public String toString() {
        return "Passagem: " + idPassagem + "\nDestino: " + idDestino + "\nCliente: " + idCliente +
               "\nPromoção: " + idPromoção + "\nData de Partida: " + dataPartida + "\nData de Retorno: " + dataRetorno +
               "\nPreço da Passagem: " + preçoPassagem + "\nNúmero de Passageiros: " + numPassageiros;
    }

	public void deletarPassagem(int idPassagem2) {
		// TODO Auto-generated method stub
		
	}

	public void atualizarPassagem(Passagens passagemAtualizada) {
		// TODO Auto-generated method stub
		
	}

	public void consultarPassagens() {
		// TODO Auto-generated method stub
		
	}

	public void criarPassagem(Passagens passagem) {
		// TODO Auto-generated method stub
		
	}


}