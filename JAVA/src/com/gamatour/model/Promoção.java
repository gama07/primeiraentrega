package com.gamatour.model;

public class Promoção {

    private int idPromoção;
    private int desconto;

    public Promoção() {
        super();
    }

    public Promoção(int desconto) {
        super();
        this.desconto = desconto;
    }

    public int getIdPromoção() {
        return idPromoção;
    }

    public void setIdPromocao(int idPromoção) {
        this.idPromoção = idPromoção;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        return "Promoção: " + idPromoção + "\nDesconto: " + desconto + "%";
    }
}
