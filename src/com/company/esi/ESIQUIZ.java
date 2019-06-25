package com.company.esi;

import com.sun.java.util.jar.pack.*;
import com.sun.prism.paint.Stop;

import java.util.*;

class ESIQUIZ{

    //Attribus

    private Formateur[] tabFomrateurs = new Formateur[1];
    private Compte compteConnecte;
    private static Scanner sc = new Scanner(System.in);

    //Methodes

    private void seConecter(){
        int type;
        System.out.print("Vous etes 1-Formateur 2-Apprenant ");
        type= sc.nextInt();
        System.out.print("Veuillez introduire votre Login : ");
        String login = sc.nextLine();
        System.out.print("Mot De Passe : ");
        String mdp = sc.nextLine();
        switch(type){
            case 1 : compteConnecte = SearchFormateur(login,mdp);
            case 2 : compteConnecte = SearchApprenant(login,mdp);
        }
        if(compteConnecte != null )
            Session(compteConnecte);
        else
            System.out.println("la Connexion a echoue (login ou mot de passe incorrect)");
    }

    private Compte SearchFormateur(String login, String mdp){
        if((tabFomrateurs[0].login==login)&&(tabFomrateurs[0].motDePasse==mdp))
            return tabFomrateurs[0];
        else
            return null;
    }
    private Compte SearchApprenant(String login, String mdp){
        if(tabFomrateurs[0]!=null)
        {
            return null;
        }
        else{
            System.out.println("Message d'erreur : Aucun Formateur n'a ete cree ");
            return null ;
        }
    }

    private void seDeconnecter(){

    }
    private Quiz generationCopieReponse(Quiz quiz){
        quiz= new Quiz();
        return quiz ;
    }
    private void evaluationAuto(Quiz quizTermine){

    }
    private void afficherResultat(Apprenant apprenant){

    }
    private void creerCompteFormateur(){
        tabFomrateurs[0]= new Formateur();

    }
    public void menuPrincipale(){

        int option;

        System.out.println("***Menu Beta test***");
        System.out.println("1-creer compte fomrateur");
        System.out.println("2-Se connecter a un compte");
        System.out.println("0-Quitter");

        option = sc.nextInt();
        switch(option)
        {
            case 1 :  creerCompteFormateur(); break;
            case 2 :  seConecter(); break;
            case 0 :
                System.out.println(" \n ***Fermeture du programme ! :) *** ");
                System.exit(0); //exit
            default : break;
        }
    }
    public void Session(Compte cmp){
        boolean connecte = true;

        System.out.println(" Ouverture de la session : ");
        while (connecte){
            cmp.Menu(cmp , connecte);
        }

        System.out.println(" Fin de la Session ! ");
    }

}