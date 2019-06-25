package com.company.esi;

import java.util.Scanner;

class Apprenant extends Compte{


    public Apprenant(){
        super();
        super.type = 0;
        //initialistation et chargement des Quiz de l'apprenant
    }
    private static Scanner sc = new Scanner(System.in);

    @Override
    public void Menu(){

        int choix ;
        while(this.connected) {
            System.out.println(" \n ***Menu Apprenant*** ");
            System.out.println(" 1- Afficher liste des Quiz ");
            System.out.println(" 2- Se Deconnecter ");
            choix = sc.nextInt();

            switch (choix) {
                case 1 : afficherListeQuiz(); break;
                case 2 : this.connected = false;  break;
            }
        }
    }

    //Attribus

    public Quiz[] tabQuiz;
    private int nbQuiz;
    public Quiz quizEnCours;
    public float reussite;
    private int nbQuizSoumis;

    //Methodes


    public void afficherListeQuiz(){

    }
    public Quiz selectionnerQuiz(String notion){

        Quiz quiz= new Quiz();
        return quiz ;

    }
    public void visualiserQuiz(Quiz quiz){

    }
    public void repondreQuiz(Quiz quiz){

    }
    public void sauvegarderReponse(Quiz quiz){

    }
    public void soumettreEvaluation(Quiz quiz){

    }


}