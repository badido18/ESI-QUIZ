package com.company.esi;

import java.util.Scanner;

abstract class Compte{

    //Attribus

    public int  type; //le type du compte apprenant "0" oubien formateur "1" ceci est un indicateur eventuelle
    private int id;
    private String Nom;
    private String preNom;
    private String dateNaissance;
    private String adresse;
    public String login ;
    public String motDePasse;
    public boolean connected =false;

    //Constructeur

    Compte(String nom, String prenom, String dateNaissance){
        this.Nom=nom;
        this.preNom=prenom;
        this.dateNaissance=dateNaissance;
        defineloginDefault();
        defineMotDePasseDefault();
        DisplayLogin();
    }

    //methodes

    private void defineloginDefault(){
        login = preNom + Nom;
    }

    private void defineMotDePasseDefault(){
        motDePasse= Nom + dateNaissance;
    }

    public void DisplayLogin(){
        System.out.println("Vos information : ");
        System.out.println("Login : "+login);
        System.out.println("MDP : "+motDePasse);
    }

    public void seDeconnecter(){
        this.connected=false;
    }
}