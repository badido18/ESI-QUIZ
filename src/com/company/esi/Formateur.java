package com.company.esi;

import java.util.Scanner;

class Formateur extends Compte{

    Formateur(){
        super();
        super.type = 1;
        // initialisation et chargement des quiz du formateur
    }
    static private Scanner sc = new Scanner(System.in);

    //Attribus

    public Formation formation;
    private Quiz quizTemp;

    //Methodes

    @Override
    public void Menu(){
        int choix = 0;
        while(this.connected){
            System.out.println(" \n ***Menu Foramteur*** ");
            System.out.println(" 1- Creer une Formation ");
            System.out.println(" 2- Gestion compte apprenant ");
            System.out.println(" 3- Gestion des Quiz ");
            System.out.println(" 0- Se deconnecter ");
            choix = sc.nextInt();
            switch (choix) {
                case 1 : creerFormation();break;
                case 2 : GestionCompteApprenant();break;
                case 3 : creerFormation();break;
                case 0 : seDeconnecter(); break ;
            }
        }

    }

    public void GestionCompteApprenant(){
        boolean quit = false;
        int choix = 0 ;
        while(!quit){
            System.out.println(" \n ***Gestion des Apprenant*** ");
            System.out.println(" 1- Ajouter un  compte apprenant ");
            System.out.println(" 2- Modifier un compte apprenant ");
            System.out.println(" 3- Supprimer un compte apprenant ");
            System.out.println(" 4- Consulter l'activité d'un apprenant");
            System.out.println(" 0- Retour ");
            choix = sc.nextInt();
            switch (choix) {
                case 1 : creerCompteApprenant();break;
                case 2 : modifierCompteApprenant();break;
                case 3 : supprimerCompteApprenant();break;
                case 4 : consulterActiviteApprenant();break;
                case 0 : quit = true ; break;
            }
        }
    }

    public void GestionDesQuiz(){
        boolean quit = false;
        int choix = 0 ;
        while(!quit){
            System.out.println(" \n ***Gestion des Quiz de la formation*** ");
            System.out.println(" 1- Afficher les Quiz ");
            System.out.println(" 2- Ajouter Quiz");
            System.out.println(" 3- Modifier Quiz ");
            System.out.println(" 4- Supprimer un Quiz");
            System.out.println(" 0- Retour ");
            choix = sc.nextInt();
            switch (choix) {
                case 1 : afficherQuiz();
                case 2 : ajouterQuiz();break;
                case 3 : modifierQuiz();break;
                case 4 : supprimerQuiz();
                case 0 : quit = true ; break;
            }
        }
    }

    private void creerFormation(){
        formation = new Formation();
        //il peut creer une seule
    }
    private void creerCompteApprenant(){
        try{
            formation.nbapprenant++;
            formation.groupeApprenant.add(new Apprenant());
        }
        catch(NullPointerException e){
            System.out.println("Aucune formation n'as ete cree ! ( Veuillez creer une formation avant )");
        }

    }
    private void modifierCompteApprenant(){
        Compte app;
        System.out.print("Entrer le login  de l'apprenant : ");
        app = formation.SearchApprenant(sc.nextLine());
        //partie menu
            boolean quit = false;
            while(!quit){
                int choix;
                System.out.println(" \n ***Gestion des Quiz de la formation*** ");
                System.out.println(" \n 0- Retour ");
                choix =sc.nextInt();
                switch(choix){
                    case 1 : break;
                    case 0 : quit= true ;break;
                }
            }
    }
    private void supprimerCompteApprenant(){
        Compte app;
        String log;
        System.out.print("Entrer le login  de l'apprenant : ");
        sc.nextLine();//en plus car bug
        log = sc.nextLine();
        app = formation.SearchApprenant(log);
        if(formation.groupeApprenant.remove(app))
            System.out.print("Operation effectue avec succes");
        else
            System.out.print("Ce login n'existe pas");
    }
    public void consulterActiviteApprenant() {
        formation.DisplayApprenant();
    }
    public void supprimerQuestion(){

    }
    public void ajouterQuestion(){

    }
    public void modifierQuestion(){

    }
    public void VisualiserQuestion(){

    }
    private void afficherQuiz(){

    }
    private void modifierQuiz(){

    }
    private void ajouterQuiz(){

    }
    private void supprimerQuiz(){

    }
    //aprés l'integration graphique ces methode auront des arguments
}