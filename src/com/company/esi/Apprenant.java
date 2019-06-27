package com.company.esi;

import java.util.ArrayList;
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

    public List<Quiz> tabQuiz = new ArrayList<>();
    public Quiz quizEnCours;
    private int nbQuizSoumis = 0;
    public float accompGenerale=0;
    public float reussGenreale=0;

    //Methodes


    public void afficherListeQuiz(){
        for(Quiz q :tabQuiz){
            q.DisplaySelf();
        }

    }
    public void visualiserQuiz(Quiz quiz){
        quiz.DisplaySelf();
    }
    public void repondreQuiz(Quiz quiz,List<Reponse> R){
        int i = 0 ;
        for(Question q : quiz.tabQuestions){
            q.Afficher();
            q.repondre(R.get(i));
            i++;
            quiz.accomplissement++;
        }
        quiz.accomplissement/=quiz.tabQuestions.size();
    }
    public void soumettreEvaluation(Quiz quiz){
        for(Question q : quiz.tabQuestions){
            quiz.reussite+=q.evaluerReponse();
        }
        quiz.reussite/=quiz.tabQuestions.size();
    }


}