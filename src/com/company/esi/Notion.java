package com.company.esi;

import javax.naming.Name;
import java.awt.geom.QuadCurve2D;
import java.util.List;
import java.util.Scanner;

public class Notion {

    Notion(String Name){
        this.Name= Name;
    }
    private Scanner sc = new Scanner(System.in);
    private String Name;
    public List<Question> tabQues;
    public int nbQuestions=0;

    public void ajouterQCU(String enonce,List<String> propo,int bonnerep){
        tabQues.add(new Qcu());
        nbQuestions++;
    }
    public void ajouterQO(String enonce,String reponse){
        tabQues.add(new Qo());
        nbQuestions++;
    }
    public void ajouterQCM(String enonce,List<String> propo ,List<Integer> nbpropojuste){
        tabQues.add(new Qcm());
        nbQuestions++;
    }
    public void suprimerQuestion(int numero){
        tabQues.remove(tabQues.get(numero));
        nbQuestions--;
    }
    public void modifierQuestion(int numero,String enonce){
        tabQues.get(numero).enonce=enonce;
    }
}

