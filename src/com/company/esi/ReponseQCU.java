package com.company.esi;

import java.util.List;

public class ReponseQCU extends Reponse {
    ReponseQCU(){

    }

    ReponseQCU(int reps){
        this.rep=reps;
    }

        public void remplirReponse(int n){
            rep=n;
        }

    }

