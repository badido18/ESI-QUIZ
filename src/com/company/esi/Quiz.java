package com.company.esi;

import javafx.geometry.NodeOrientation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Quiz{

    Quiz(){

    }
    Quiz(String titre,String dateOuverture,String dateExpiration){
        //constructeur
        this.title = titre;
        this.dateOuverture = dateOuverture;
        this.dateExpiration = dateExpiration;
    }

    //Attribus
    private Scanner sc = new Scanner(System.in);
    public String title;
    private List<Notion> tabNotion = new ArrayList<>();
    public List<Question> tabQuestions=new ArrayList<>();
    private int nbquestion;
    private String dateOuverture;
    private String dateExpiration;
    private int nbNotions;
    public float accomplissement=0 ;
    public float reussite=0;
    private boolean soumis;

    //Methodes

    public void genererQuiz(){

        // gros boulot

    }
    public void soumettreQuiz(){
        accomplissement=0;
        for (Question q :tabQuestions) {
            if(q.accompli=true)
                accomplissement++;
        }
        accomplissement/=tabQuestions.size();
    }
    public void evaluerQuiz(){
        float pt=0;
        for(Question n : tabQuestions){
                pt += n.evaluerReponse();
        }
        reussite = pt / nbquestion;
    }
    public void DisplaySelf(){
        System.out.println(title+" : Nombre de notions : "+nbNotions+ " \n Date Ouv : "+dateOuverture+ " \n Date Exp : "+dateExpiration);
    }

    public Question SearchQuestion(Question ques){
        for(Question q : tabQuestions){
            if(q.numero == ques.numero)
                return q;
        }
        return null;
    }
    public void ajouterNotion(Notion not){
        tabNotion.add(not);
        tabQuestions.addAll(not.tabQues);
    }


}