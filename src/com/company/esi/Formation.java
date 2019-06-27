package com.company.esi;
import sun.security.krb5.internal.APRep;

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
        avoirTauxresultat();
        Comparator<Apprenant> compareById = new Comparator<Apprenant>() {
            @Override
            public int compare(Apprenant o1, Apprenant o2) {
                return Float.compare(o1.reussGenreale,o2.reussGenreale);
            }
        };
        Collections.sort(groupeApprenant,compareById);

        for(Apprenant a : groupeApprenant){
            System.out.println(a.login);
            for (Quiz q: a.tabQuiz){
                System.out.print(q.title+" accomplissement: "+ q.accomplissement*100 +" Reussite : " +q.reussite*100);
            }
            System.out.print("\n");
        };

    }



    public void avoirTauxresultat(){
        for (Apprenant a : groupeApprenant){

            for(Quiz q:a.tabQuiz){
                a.reussGenreale+=q.reussite;
            }
            a.reussGenreale/=tabQuiz.size();

        }
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