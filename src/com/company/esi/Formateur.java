package com.company.esi;

import java.util.Scanner;

class Formateur extends Compte{

    Formateur(String nom, String prenom, String dateN){
        super(nom,prenom,dateN);
        super.type = 1;
        // initialisation et chargement des quiz du formateur
    }
    //Attribus

    public Formation formation;
    private Quiz quizTemp;

    //Methodes



    public void creerFormation(){
        formation = new Formation();
        //il peut creer une seule
    }
    public void creerCompteApprenant(String nom, String prenom, String dateN){
        try{
            formation.nbapprenant++;
            formation.groupeApprenant.add(new Apprenant(formation.tabQuiz,nom,prenom,dateN));
        }
        catch(NullPointerException e){
            System.out.println("Aucune formation n'as ete cree ! ( Veuillez creer une formation avant )");
        }

    }
    public void modifierCompteApprenant(String login,String nvlogin,String nvmdp){
        Compte app;
        app = formation.SearchApprenant(login);
        app.login=nvlogin;
        app.motDePasse=nvmdp;
    }
    public void supprimerCompteApprenant(String login){
        try{
            formation.groupeApprenant.remove(formation.SearchApprenant(login));
            System.out.print("Operation effectue avec succes");
        }
        catch(NullPointerException e){
            System.out.print("Ce login n'existe pas");
        }
    }
    public void consulterActiviteApprenant() {
        for(Apprenant a : formation.groupeApprenant){
            System.out.println(a.login);
            for (Quiz q: a.tabQuiz){
                System.out.print(q.title+" accomplissement: "+ q.accomplissement);
            }
            System.out.print("\n");
        }
    }
    public void supprimerQuestion(Question ques){
    }
    public void ajouterQuestion(){

    }
    public void modifierQuestion(){

    }
    public void VisualiserQuestion(){

    }
    public void afficherQuiz(){
        formation.DisplayQuiz();
    }
    public void modifierQuiz(String tit){
        try{
            Quiz qz = formation.SearchQuiz(tit);
            //modification
        }
        catch (NullPointerException  e){
            System.out.println("le Quiz : "+tit+" n'existe pas! ");
        }


    }
    public void ajouterQuiz(String tit){
        try{
            formation.SearchQuiz(tit);
        }
        catch(NullPointerException e){
            formation.tabQuiz.add(new Quiz());
        }
    }
    public void supprimerQuiz(String tit){
        try {
            formation.tabQuiz.remove(formation.SearchQuiz(tit));
        }
        catch (NullPointerException e){
            System.out.println("Ce Quiz n'existe pas!");
        }
    }
    public void selectQuiz(String tit){
        try {
            quizTemp=formation.SearchQuiz(tit);
        }
        catch (NullPointerException e){
            System.out.println("Ce Quiz n'existe pas!");
        }
    }
    //aprés l'integration graphique ces methode auront des arguments
}