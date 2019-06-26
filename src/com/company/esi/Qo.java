package com.company.esi;

class Qo extends Question{

    //Attribus

    private String bonnereponse;
    private String reponse;

    //Methodes

    public int evaluerReponse(){
        if(reponse.equals(bonnereponse))
            return 1 ;
        return 0 ;
    }
    public void repondre(String userReponse){
        reponse=userReponse;
    }

}