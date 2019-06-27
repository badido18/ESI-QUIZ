package com.company.esi;
import java.lang.Cloneable;
import sun.security.krb5.internal.APRep;

import java.util.List;
import java.util.Scanner;

class Formateur extends Compte{

    Formateur(String nom, String prenom, String dateN){
        super(nom,prenom,dateN);
        super.type = 1;
        // initialisation et chargement des quiz du formateur
    }
    //Attribus

    public Formation formation;
    public Quiz quizTemp;

    //Methodes


    public void creerFormation(String nom,String Des,String DD,String DF){
        formation = new Formation(nom,Des,DD,DF);
    }
    public void creerCompteApprenant(String nom, String prenom, String dateN){
        try{
            formation.nbapprenant++;
            formation.groupeApprenant.add(new Apprenant(formation.tabQuiz,nom,prenom,dateN));
        }
        catch(NullPointerException e){
            System.out.println("Aucune formation ou quiz n'as ete cree ! ( Veuillez creer une formation avant )");
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
            System.out.println("Operation effectue avec succes");
        }
        catch(NullPointerException e){
            System.out.println("Ce login n'existe pas");
        }
    }
    public void consulterActiviteApprenant() {
        System.out.println("Les comptes : ");
        for(Apprenant a : formation.groupeApprenant){
            System.out.println(a.login);
            for (Quiz q: a.tabQuiz){
                System.out.print(q.title+" accomplissement: "+ q.accomplissement*100 +" Reussite : " +q.reussite*100);
            }
            System.out.print("\n");
        }
        System.out.println("FIn de la liste");
    }
    public void consulterActiviteApprenant(Apprenant a) {
        System.out.println(a.login);
            for (Quiz q: a.tabQuiz){
                System.out.print(q.title+" accomplissement  "+ q.accomplissement*100 +" Reussite : " +q.reussite*100);
            }
            System.out.print("\n");
    }
    public void supprimerQuestion(Question ques,Quiz q){
        q.tabQuestions.remove(ques);
    }
    public void ajouterQuestion(Question ques, Quiz q){
        q.tabQuestions.add(ques);
    }
    public void modifierQuestion(Question ques, Quiz q){
        try
        {
            q.SearchQuestion(ques);
            //modification
        }
        catch(NullPointerException e){
            System.out.println("cette question n'existe pas !");
        }
    }
    public void VisualiserQuestion(Question question){
        question.Afficher();
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
    public void ajouterQuiz(String tit,String dateO,String dateE){
        if(formation.SearchQuiz(tit)== null) {
            formation.tabQuiz.add(new Quiz(tit, dateE, dateO));
            System.out.println("quiz ajoute avec succes");
        }

    }
    public void supprimerQuiz(String tit){
        try {
            formation.tabQuiz.remove(formation.SearchQuiz(tit));
        }
        catch(NullPointerException e){
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
    public void majQuiz(Quiz q, List<Apprenant>  listapp){
        for (Apprenant a : listapp){
            for (Quiz b :a.tabQuiz) {
                    if(q.title.equals(b.title)){
                        b.tabQuestions=q.tabQuestions;
                        b.title=q.title;
                    }
            }
        }
    }
    public void ajoutQuizToApp(){
        for(Apprenant a: formation.groupeApprenant){
           a.tabQuiz.addAll(formation.tabQuiz);
            //a.tabQuiz = formation.tabQuiz;
        }
    }
}