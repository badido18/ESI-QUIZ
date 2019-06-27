package com.company.esi;

import java.util.List;

public class ReponseQCM extends Reponse {

    public List<Integer> listrep;
    public void CocherReponse(int n){
            listrep.add(n);
    }

}
