package com.company.esi;
import java.util.*;

class Formation{

    Formation(String nom,String Des,String DD,String DF){
        this.nom=nom;
        this.description=Des;
        this.dateDebut=DD;
        this.dateFin=DF;
        System.out.println("*** Formation cree avec succes *** ");
    }

    //Attribus

    public List<Apprenant> groupeApprenant = new ArrayList<>() ;
    public int nbapprenant = 0;
    public List<Quiz> tabQuiz = new ArrayList<>();
    private String nom ;
    private String description ;
    private String dateDebut ;
    private String dateFin ;
    //Methodes

    public Compte SearchApprenant(String login, String mdp){
        for(Apprenant a : groupeApprenant) {
            if(a.login.equals(login) && a.motDePasse.equals(mdp))
                return a;
        }
        return null;
    }

    public Compte SearchApprenant(String login){
        for (Apprenant o : groupeApprenant) {
            if(o.login.equals(login) )
                return o;
        }
        return null;
    }

    public Quiz SearchQuiz(String title){
        for (Quiz o : tabQuiz) {
            if(o.title.equals(title) )
                return o;
        }
        return null;
    }

    public void DisplayApprenant(){
        Apprenant tmp ;
        Iterator<Apprenant> it = groupeApprenant.iterator();
        System.out.println(" Nombre d'apprenant : "+ nbapprenant);
        while (it.hasNext()) {
            System.out.println(" le login : " + it.next().login);
        }
    }


    public void avoirClassement(){
            for (Apprenant a : groupeApprenant){
                
            }

        }



    private float avoirTauxresultat(Apprenant apprenant){
        for (Apprenant a : groupeApprenant){

            for(Quiz q:a.tabQuiz){
                a.accompGenerale+=q.accomplissement;
                a.reussGenreale+=q.reussite;
            }
            a.accompGenerale/=tabQuiz.size();
            a.reussGenreale/=tabQuiz.size();

        }
        return 0;
    }
    public void mettreAjourQuiz(){
        //charge les modification du formateur au apprenant
        for (Apprenant o: groupeApprenant ){

        }

    }
    public void DisplayQuiz(){
            for(Quiz q : tabQuiz){
                q.DisplaySelf();
            }

    }


}