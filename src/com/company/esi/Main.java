package com.company.esi;

import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ESIQUIZ application = new ESIQUIZ();
        //deroulement
        //creation compte formateur
        application.creerCompteFormateur("form","pr","12081970");
        //connexion au compte
        application.seConecter("prform","form12081970",1);
        Formateur f = (Formateur) application.compteConnecte;
        //Creation d'un formation
        f.creerFormation("POO","description","05062019","15062019");
        //Creation des comptes des apprenant
        f.creerCompteApprenant("boudis","madjid","08102000");
        f.creerCompteApprenant("yahiaoui","ahmed","25121999");
        //ajout d'un compte apprenant
        f.creerCompteApprenant("derouas","noufel","08102000");
        //suppression d'un compte apprenant
        f.supprimerCompteApprenant("noufelderouas");
        //modification d'un compte apprenant
        f.modifierCompteApprenant("ahmedyahiaoui","ahmed1","yahiaoui99");
        //afficher les comptes des apprenants
        f.consulterActiviteApprenant();

        //creation de notion question quiz

        //creation 2 quiz
        f.ajouterQuiz("quiz1","12052019","25122019");
        f.ajouterQuiz("quiz2","12052019","25122019");
        f.selectQuiz("quiz1");
        //ajout notion
        Notion notion=new Notion("notion1");
        //ajout 3 question de la notion
        notion.ajouterQCM("QCM",new ArrayList<String>(Arrays.asList("propo1","propo2","propo3")),new ArrayList<Integer>(Arrays.asList(1,2)));
        notion.ajouterQCU("QCU",new ArrayList<String>(Arrays.asList("propo1","propo2","propo3")),2);
        notion.ajouterQO("QO","bonnerep");
        notion.ajouterQO("QO2","bonnerep2");
        //supression dune question
        notion.suprimerQuestion(3);
        //modifier question
        notion.modifierQuestion(1,"nouvel enonce");
        //supprimer quiz
        f.supprimerQuiz("quiz2");
        //ajout notion au quiz
        f.quizTemp.ajouterNotion(notion);
        //ajout du quiztemp au tab
        f.AddQuiztmp();


        //sauvegarde
        f.ajoutQuizToApp();
        //Connexion a un compte apprenant
        f.seDeconnecter();
        application.seConecter("ahmed1","yahiaoui99",0);
        Apprenant apr = (Apprenant)application.compteConnecte;
        //selectioner le quiz
        Quiz q = apr.tabQuiz.get(f.formation.tabQuiz.indexOf(f.formation.SearchQuiz("Quiz1")));
        //l'apprenant repond au quiz
        //affichage du quiz;
        apr.visualiserQuiz(q);
        //creation des reponses
        ReponseQCU rqcu = new ReponseQCU(1);
        ReponseQO rqo = new ReponseQO("bonnerep");
        ReponseQCM rqcm = new ReponseQCM(new ArrayList<>(Arrays.asList(1,2)));
        List<Reponse>  listereponse = new ArrayList<Reponse>(Arrays.asList(rqcm,rqcu,rqo));
        apr.repondreQuiz(q,listereponse);
        //soummetre le quiz
        q.soumettreQuiz();
        //mettre a evaluation
        apr.soumettreEvaluation(q);
        //afficher activité d'un apprenant
        f.consulterActiviteApprenant(apr);
        //avoir le calssement
        f.formation.avoirClassement();
    }
}
