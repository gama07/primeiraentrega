package com.gamatour.model;

public class Cliente {

    private int idCliente;
    private String nomeCliente;
    private String telefoneCliente;
    private String cpfCliente;
    private String emailCliente;

    public Cliente() {
        super();
    }

    public Cliente(String nomeCliente, String telefoneCliente, String cpfCliente, String emailCliente) {
        super();
        this.nomeCliente = nomeCliente;
        this.telefoneCliente = telefoneCliente;
        this.cpfCliente = cpfCliente;
        this.emailCliente = emailCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    @Override
    public String toString() {
        return "Cliente: " + idCliente + "\nNome: " + nomeCliente + "\nCPF: " + cpfCliente +
               "\nTelefone: " + telefoneCliente + "\nEmail: " + emailCliente;
    }

	public void setNomeCliente() {
		// TODO Auto-generated method stub
		
	}
}

