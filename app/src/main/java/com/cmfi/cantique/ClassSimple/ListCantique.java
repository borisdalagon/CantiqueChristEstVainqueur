package com.cmfi.cantique.ClassSimple;

public class ListCantique {

    private String titre;
    private String numero;
    private String couplet1;
    private String couplet2;
    private String couplet3;
    private String couplet4;
    private String couplet5;
    private String couplet6;
    private String refrain;
    private String refrain1;
    private String refrain2;
    private String refrain3;
    private String refrain4;
    private String refrain5;
    private String refrain6;



    public ListCantique(String titre, String numero) {
        this.titre = titre;
        this.numero = numero;
    }

    public ListCantique(String numero, String titre, String couplet1, String couplet2, String couplet3, String couplet4, String couplet5, String couplet6, String refrain, String refrain1, String refrain2, String refrain3, String refrain4, String refrain5, String refrain6) {
        this.numero = numero;
        this.titre = titre;
        this.couplet1 = couplet1;
        this.couplet2 = couplet2;
        this.couplet3 = couplet3;
        this.couplet4 = couplet4;
        this.couplet5 = couplet5;
        this.couplet6 = couplet6;
        this.refrain = refrain;
        this.refrain1 = refrain1;
        this.refrain2 = refrain2;
        this.refrain3 = refrain3;
        this.refrain4 = refrain4;
        this.refrain5 = refrain5;
        this.refrain6 = refrain6;
    }


    public String getTitre() {
        return titre;
    }

    public String getNumero() {
        return numero;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCouplet1() {
        return couplet1;
    }

    public void setCouplet1(String couplet1) {
        this.couplet1 = couplet1;
    }

    public String getCouplet2() {
        return couplet2;
    }

    public void setCouplet2(String couplet2) {
        this.couplet2 = couplet2;
    }

    public String getCouplet3() {
        return couplet3;
    }

    public void setCouplet3(String couplet3) {
        this.couplet3 = couplet3;
    }

    public String getCouplet4() {
        return couplet4;
    }

    public void setCouplet4(String couplet4) {
        this.couplet4 = couplet4;
    }

    public String getCouplet5() {
        return couplet5;
    }

    public void setCouplet5(String couplet5) {
        this.couplet5 = couplet5;
    }

    public String getCouplet6() {
        return couplet6;
    }

    public void setCouplet6(String couplet6) {
        this.couplet6 = couplet6;
    }

    public String getRefrain() {
        return refrain;
    }

    public void setRefrain(String refrain) {
        this.refrain = refrain;
    }

    public String getRefrain1() {
        return refrain1;
    }

    public void setRefrain1(String refrain1) {
        this.refrain1 = refrain1;
    }

    public String getRefrain2() {
        return refrain2;
    }

    public void setRefrain2(String refrain2) {
        this.refrain2 = refrain2;
    }

    public String getRefrain3() {
        return refrain3;
    }

    public void setRefrain3(String refrain3) {
        this.refrain3 = refrain3;
    }

    public String getRefrain4() {
        return refrain4;
    }

    public void setRefrain4(String refrain4) {
        this.refrain4 = refrain4;
    }

    public String getRefrain5() {
        return refrain5;
    }

    public void setRefrain5(String refrain5) {
        this.refrain5 = refrain5;
    }

    public String getRefrain6() {
        return refrain6;
    }

    public void setRefrain6(String refrain6) {
        this.refrain6 = refrain6;
    }
}
