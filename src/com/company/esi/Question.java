package com.company.esi;

abstract class Question{

    //Attribus

    private String  type;
    public int numero;
    public  String enonce;
    public boolean accompli=false;
    //Methodes

    abstract float  evaluerReponse();
    public  void  Afficher(){
        System.out.print("Question numero :" +numero + "\n"+enonce);
    }
    abstract void repondre(Reponse R);

}