package com.example;

import java.util.ArrayList;

public class FunnyJoke {
    private ArrayList<String> jokelist=new ArrayList<String>();
    public FunnyJoke(){
        jokelist.add("Yoda Arin: What is a Jedi's favorite candy?\n Dan: Hmmm, I don't know...\n Yoda Arin: Obi Wan Canoli!\n" +
                "HMMMMMMMMMMMMMMMMMMMMMMMMMM!\nFUNNNNNNNNNY JOKE");
        jokelist.add("Yoda Arin: What did Luke Skywalker say to his sister's bullies?\n Dan: Hmmm, I don't know...\n " +
                "Yoda Arin: Don't you LEIA finger on her!\nHMMMMMMMM!\nFUNNNNNNNNNY JOKE");
        jokelist.add("Yoda Arin: What is a Jedi's favorite dessert?\n Dan: Is this a gelato joke?...\n " +
                "Yoda Arin: Obi Wan Canoli!\nHMMMMMMMMMMMMMMM!\nFUNNNNNNNNNY JOKE");
    }
    public ArrayList<String> getJokelist(){
        return jokelist;
    }
    public String getFunnyJoke(){
        jokelist.add(jokelist.remove(0));
        return jokelist.get(0);
    }
}
