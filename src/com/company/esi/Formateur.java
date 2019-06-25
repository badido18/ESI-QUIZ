package com.company.esi;

import java.util.Scanner;

class Formateur extends Compte{

    Formateur(){
        super();
        super.type = 1;
        // initialisation et chargement des quiz du formateur
    }
    static private Scanner sc = new Scanner(System.in);
    @Override
    public void Menu(){
        while(this.connected){
            int choix = 0;
            System.out.println(" \n ***Menu Foramteur*** ");
            System.out.println(" 1- Visualiser les Quiz ");
            choix = sc.nextInt();
            switch (choix) {
                case 1 : break;
                case 2 : this.connected = false; break ;
            }
        }

    }
    //Attribus

    public Formation formation;
    private Quiz quizTemp;

    //Methodes

    public void creerFormation(){

    }
    public void creerCompteApprenant(){

    }
    public void modifierCompteApprenant(){

    }
    public void supprimerCompteApprenant(){

    }
    public void consulterActiviteApprenant(){

    }
    public void modifierQuiz(){

    }
    public void supprimerQuestion(){

    }
    public void ajouterQuestion(){

    }
    public void modifierQuestion(){

    }
    public void sauvegarder(){

    }
    public void afficherQuiz(){

    }

}