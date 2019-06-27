package com.company.esi;

import java.util.List;

class Qcu extends Question {
    Qcu(String enonce,List<String> propo,int bonnerep){
        this.enonce=enonce ;
        this.propositions=propo;
        this.bonnereponse=bonnerep;
    }

    //Attribus

    private List<String> propositions;
    private int nbpropositions;
    private int  bonnereponse;
    private int reponseSelectione;

    //Methodes

    public float evaluerReponse(){
        if( propositions.get(bonnereponse).equals(propositions.get(reponseSelectione)) )
            return  1 ;
        return 0;
    }

    public void repondre(Reponse R){
        reponseSelectione= R.rep;
        accompli=true;

    }

    public void Afficher(){
        super.Afficher();
        int i=0;
        System.out.println("Type QCu :");
        for (String s:propositions) {
            System.out.println(i+"-"+s);
            i++;
        }
    }


}