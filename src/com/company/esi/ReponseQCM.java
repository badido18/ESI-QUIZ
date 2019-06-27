package com.company.esi;

import java.util.ArrayList;
import java.util.List;

public class ReponseQCM extends Reponse {
    ReponseQCM(){

    }
    ReponseQCM(List<Integer> listrep){
        this.listrep.addAll(listrep);
    }
    public void CocherReponse(int n){
            listrep.add(n);
    }

}
