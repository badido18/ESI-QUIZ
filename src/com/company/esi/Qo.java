package com.company.esi;

class Qo extends Question{

    //Attribus

    private String bonnereponse;
    private String reponse;

    //Methodes

    public float evaluerReponse(){
        if(reponse.equals(bonnereponse))
            return 1 ;
        return 0 ;
    }
    public void repondre(ReponseQO R){
        reponse=R.rep;
        accompli=true;
    }
    public void Afficher(){
        super.Afficher();
        System.out.println("Type Qo ");
    }

}