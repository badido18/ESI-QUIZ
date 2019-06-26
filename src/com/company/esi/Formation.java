package com.company.esi;
import java.util.*;

class Formation{

    Formation(){
        System.out.print("Nommer la formation : ");
        nom=sc.nextLine();
        System.out.println("Description :");
        description=sc.nextLine();
        System.out.print("Date de Debut ( jj/mm/aaaa)");
        dateDebut=sc.nextLine();
        System.out.print("Date de Fin ( jj/mm/aaaa)");
        dateFin =sc.nextLine();
        System.out.println("*** Formation cree avec succes *** ");
    }

    //Attribus

    public List<Apprenant> groupeApprenant = new ArrayList<>() ;
    public int nbapprenant = 0;
    public List<Quiz> tabQuiz;
    private String nom ;
    private String description ;
    private String dateDebut ;
    private String dateFin ;
    private Scanner sc = new Scanner(System.in);
    //Methodes

    public Compte SearchApprenant(String login, String mdp){
        Apprenant tmp ;
        Iterator<Apprenant> it = groupeApprenant.iterator();
        while (it.hasNext()) {
            tmp=it.next();
            if(tmp.login.equals(login) && tmp .motDePasse.equals(mdp))
                return tmp;

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

        List<Apprenant> tmp = new ArrayList<>();
        tmp.addAll(groupeApprenant);
        }



    private float avoirTauxresultat(Apprenant apprenant){
        //calcul le taux de de russite
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