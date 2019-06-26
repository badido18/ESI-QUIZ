package com.company.esi;

import java.util.List;
import java.util.Scanner;

class Apprenant extends Compte{


    Apprenant(List<Quiz> tabQuiz,String nom,String prenom,String dateN ){
        super(nom,prenom,dateN);
        super.type = 0;
        this.tabQuiz.addAll(tabQuiz);
    }
    private static Scanner sc = new Scanner(System.in);



    //Attribus

    public List<Quiz> tabQuiz;
    public Quiz quizEnCours;
    private int nbQuizSoumis = 0;

    //Methodes




    public void afficherListeQuiz(){
        for(Quiz q :tabQuiz){
            q.DisplaySelf();
        }

    }
    public void visualiserQuiz(Quiz quiz){
        quiz.DisplaySelf();
    }
    public void repondreQuiz(Quiz quiz){
        for(Question q : quiz.tabQuestions){
            q.repondre();
        }
    }
    public void soumettreEvaluation(Quiz quiz){
        for(Question q : quiz.tabQuestions){
            q.evaluerReponse();
        }
    }


}