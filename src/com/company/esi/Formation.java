package com.company.esi;
import java.util.*;

class Formation{

    Formation(){

    }

    //Attribus

    public List<Apprenant> groupeApprenant = new ArrayList<>() ;
    private int nbapprenant;
    public List<Quiz> tabQuiz;
    private String nom ;
    private String description ;
    private String dateDebut ;
    private String dateFin ;

    //Methodes

    public Compte SearchApprenant(String login, String mdp){
        Apprenant tmp ;
        Iterator<Apprenant> it = groupeApprenant.iterator();
        while (it.hasNext()) {
            tmp=it.next();
            if(tmp.login == login && tmp .motDePasse == mdp)
                return tmp;
        }
        return null;
    }


    public void avoirClassement(){

    }
    public void avoirTauxresultat(){

    }
    public void mettreAjourQuiz(){

    }
}