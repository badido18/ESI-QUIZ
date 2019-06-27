package com.company.esi;

import java.util.List;

class Qcm extends Question{

    //Attribus

    private List<String> propositions ;
    public int nbpropositions;
    private List<String> bonneReponses;
    private int nbBonnereponses;
    private List<Integer> reponseSelectiones;
    private int nbreponsesSelectiones;

    //Methodes

    public float evaluerReponse(){
        float sum=propositions.size();
        for(Integer a: reponseSelectiones)
        {
            for(String b : bonneReponses){
                if(!propositions.get(a).equals(b)){
                    sum-=2;
                    break;
                }
            }
        }
        return sum/nbreponsesSelectiones;
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