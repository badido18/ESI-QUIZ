package com.company.esi;

import java.util.Scanner;

public class Notion {

    Notion(){
        System.out.print("Entrer la notion : ");
        Name = sc.nextLine();
    }
    private Scanner sc = new Scanner(System.in);
    private String Name;
    public Question[] esQues;
    int nbQuestions;
}

