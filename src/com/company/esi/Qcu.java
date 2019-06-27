package com.company.esi;

import java.util.List;

class Qcu extends Question {

    //Attribus

    private List<String> propositions;
    private int nbpropositions;
    private String bonnereponse;
    private int reponseSelectione;

    //Methodes

    public float evaluerReponse(){
        if( bonnereponse.equals(propositions.get(reponseSelectione)) )
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