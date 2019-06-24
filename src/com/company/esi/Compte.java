package com.company.esi;

import java.util.Scanner;

abstract class Compte{

    //Constructeur

    Compte(){
        setNom();
        setPreNom();
        setDateNaissance();
        defineloginDefault();
        defineMotDePasseDefault();

        DisplayLogin();
    }


    //Attribus

    private int id;
    private String Nom;
    private String preNom;
    private String dateNaissance;
    private String adresse;
    private String login ;
    private String motDePasse;

    //methodes
        static Scanner sc = new Scanner(System.in);
    public void setNom(){

        System.out.println("Création d'un compte formateur");
        System.out.println("Veuillez entrer votre nom : ");
        Nom= sc.nextLine();
    }
    public void setPreNom(){
        System.out.println("Veuillez entrer votre prenom : ");
        preNom= sc.nextLine();
    }
    public void setDateNaissance(){
        System.out.println("Veuillez entrer votre date de naissance format (jj/mm/aaaa) : ");
        dateNaissance= sc.nextLine();
    }

    private void defineloginDefault(){
        login = preNom ;
        login +=' ';
        login += Nom;
    }
    private void defineMotDePasseDefault(){
        motDePasse= Nom + dateNaissance;
    }

    public void DisplayLogin(){
        System.out.println("Login : "+login);
        System.out.println("MDP :  "+motDePasse);
    }


}