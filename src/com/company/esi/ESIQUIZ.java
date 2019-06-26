package com.company.esi;

import com.sun.java.util.jar.pack.*;
import com.sun.prism.paint.Stop;

import java.util.*;

class ESIQUIZ{

    //Attribus

    private Formateur[] tabFomrateurs = new Formateur[1];
    public Compte compteConnecte;
    private static Scanner sc = new Scanner(System.in);

    //Methodes

    private void seConecter(String login, String mdp,int type){
        try{
            switch(type){
                case 1 : compteConnecte = SearchFormateur(login,mdp);break;
                case 2 : compteConnecte = SearchApprenant(login,mdp);break;
            }
            compteConnecte.connected=true;
        }
        catch( NullPointerException e) {
            System.out.println("la Connexion a echoue (login ou mot de passe incorrect)");
        }

    }

    private Compte SearchFormateur(String login, String mdp){
        if((tabFomrateurs[0].login.equals(login) )&&(tabFomrateurs[0].motDePasse.equals(mdp)))
            return tabFomrateurs[0];
        else
            return null;
    }
    private Compte SearchApprenant(String login, String mdp){
        if(tabFomrateurs[0]!=null)//exception
            return tabFomrateurs[0].formation.SearchApprenant(login,mdp);
        else{
            System.out.println("Message d'erreur : Aucun Formateur n'a ete cree ");
            return null ;
        }
    }

    private Quiz generationCopieReponse(Quiz quiz){
        quiz= new Quiz();
        return quiz ;
    }
    private void evaluationAuto(Quiz quizTermine){

    }
    private void afficherResultat(Apprenant apprenant){

    }
    private void creerCompteFormateur(String nom,String prenom,String dateN){
        tabFomrateurs[0]= new Formateur(nom,prenom,dateN);
    }
}