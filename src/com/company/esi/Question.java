package com.company.esi;

abstract class Question{

    //Attribus

    private String  type;
    public int numero;
    private String enonce;
    public String reponse;

    //Methodes

    abstract int  evaluerReponse();
    abstract void repondre();

}