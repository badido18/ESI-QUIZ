package com.company.esi;

class Qo extends Question{
    Qo(String enonce,String reponse,int numero){
        this.enonce=enonce;
        this.reponse=reponse;
        this.numero=numero;

    }

    //Attribus

    private String bonnereponse;
    private String reponse;

    //Methodes

    public float evaluerReponse(){
        if(reponse.equals(bonnereponse))
            return 1 ;
        return 0 ;
    }
    public void repondre(Reponse R){
        reponse=R.repS;

        accompli=true;
    }
    public void Afficher(){
        super.Afficher();
        System.out.println("Type Qo ");
    }

}