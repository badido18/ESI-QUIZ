package com.company.esi;

class Qcu extends Question {

    //Attribus

    private String[] propositions;
    private int nbpropositions;
    private String bonnereponse;
    private String reponseSelectione;

    //Methodes

    public int evaluerReponse(){
        if( reponseSelectione.equals(bonnereponse) )
            return  1 ;
        return 0;
    }
    public void repondre(int choix){
        reponseSelectione=propositions[choix];
    }


}