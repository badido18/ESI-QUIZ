package com.company.esi;

import java.util.List;

public class ReponseQO extends Reponse {

    ReponseQO(){

    }

    ReponseQO(String reps){
        this.repS=reps;
    }


        public void remplirReponse(String rep){
            this.repS=rep;
        }

    }
