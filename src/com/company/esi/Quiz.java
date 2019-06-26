package com.company.esi;

import javafx.geometry.NodeOrientation;

import java.util.List;
import java.util.Scanner;

class Quiz{

    Quiz(){
        //constructeur
        System.out.print("Veuillez entrer le titre du quiz : ");
        title = sc.nextLine();
        System.out.print("Veuillez entrer la date d'ouverture : ");
        dateOuverture = sc.nextLine();
        System.out.print("Veuillez entrer la date d'expiration : ");
        dateExpiration = sc.nextLine();
    }

    //Attribus
    private Scanner sc = new Scanner(System.in);
    public String title;
    private List<Notion> tabNotion;
    public List<Question> tabQuestions;
    private int nbquestion;
    private String dateOuverture;
    private String dateExpiration;
    private int nbNotions;
    public float accomplissement ;
    private float reussite;
    private boolean soumis;

    //Methodes

    public void genererQuiz(){

    }
    public void soumettreQuiz(){
        soumis =true;
    }
    public void evaluerQuiz(){
        int pt=0;
        for(Question n : tabQuestions){
                pt += n.evaluerReponse();
        }
        reussite = (float)pt / nbquestion;
    }
    public void DisplaySelf(){
        System.out.println(title+" : Nombre de notions : "+nbNotions+ " \n Date Ouv : "+dateOuverture+ " \n Date Exp : "+dateExpiration);
    }



}