package com.company.esi;

import java.util.ArrayList;
import java.util.List;

class Qcm extends Question{
        Qcm(String enonce,List<String> propo ,List<Integer> nbpropojuste){
            this.enonce=enonce;
            this.propositions=propo;
            this.bonneReponses = nbpropojuste;
    }


    //Attribus

    private List<String> propositions= new ArrayList<>();
    public int nbpropositions;
    private List<Integer> bonneReponses = new ArrayList<>();
    private int nbBonnereponses;
    private List<Integer> reponseSelectiones =new ArrayList<>() ;
    private int nbreponsesSelectiones;

    //Methodes

    public float evaluerReponse(){
        int sum=0;
        for (int i = 0; i <propositions.size() ; i++) {
            if(reponseSelectiones.contains(i)){
                if (bonneReponses.contains(i))
                    sum++;
                else
                    sum--;

            }
            else{
                if (bonneReponses.contains(i))
                    sum--;
                else
                    sum++;

            }
        }
        return sum/propositions.size();
    }
    public void repondre(Reponse R){
        reponseSelectiones.addAll(R.listrep);
        nbreponsesSelectiones=reponseSelectiones.size();
        accompli=true;

    }
    public void Afficher(){
        super.Afficher();
        int j=0;
        System.out.println("Type QCM :");
        for (String s:propositions) {
            System.out.println(j+"-"+s);
            j++;
        }
    }

}