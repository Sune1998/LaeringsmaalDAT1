/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 15/11/2019
 */
package model;

import java.util.ArrayList;

public class Sporgsmaal {

    private ArrayList<String> alleSporgsmaal;

    public Sporgsmaal() {
        alleSporgsmaal = new ArrayList<>();
        alleSporgsmaal.add("Forklar hvordan man erklærer og benytter variable i java.");
        alleSporgsmaal.add("Vis et eksempel på erklæring og initialisering af hhv. en instansvariabel, klassevariabel og en lokal variabel.");
        alleSporgsmaal.add("Forklar hvilke datatyper, der er i Java.");
        alleSporgsmaal.add("Vis et eksempel på typecasting fra double til int.");
        alleSporgsmaal.add("Forklar sammenhæng mellem klasser og objekter i java.");
    }

    
    public ArrayList<String> getAlleSporgsmaal()
    {
        return alleSporgsmaal;
    }

    public String getSporgsmaal(int i) {
        return alleSporgsmaal.get(i);
    }

    public void setSporgsmaal(int i, String sporgsmaal) {
        alleSporgsmaal.add(i, sporgsmaal);
    }

}
