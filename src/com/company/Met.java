package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Met {


    List<String> nazwiska1 = new ArrayList<>();

    {
        nazwiska1.add("Romanowski");
        nazwiska1.add("Gołąbek");
        nazwiska1.add("Papużyński");
        nazwiska1.add("Wójcik");

    }

    List<String> nazwiska2 = new ArrayList<>();

    {
        nazwiska2.add("Zielińska");
        nazwiska2.add("Szymańska");
        nazwiska2.add("Kowalczyk");
        nazwiska2.add("Wiśniewska");

    }

    Klasa klasa1 = new Klasa("1a", nazwiska1);
    Klasa klasa2 = new Klasa("1b", nazwiska2);


    public List<String> get2LongestLastNames() {
        List<String> finale = new ArrayList<>();
        finale.add(klasa1.nazwiska.get(getLongestString(klasa1.nazwiska)));
        finale.add(klasa2.nazwiska.get(getLongestString(klasa2.getNazwiska())));
        return finale;
    }

    public List<String> getLongestLastNames() {
        List<String> nazwiska = new ArrayList<>();
        nazwiska.addAll(klasa1.getNazwiska());
        nazwiska.addAll(klasa2.getNazwiska());

        return Collections.singletonList(nazwiska.get(getLongestString(nazwiska)));
    }


    public static int getLongestString(List<String> names) {

        int largestString = names.get(0).length();
        int index = 0;
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).length() > largestString) {
                largestString = names.get(i).length();
                index = i;
            }
        }
        return index;
    }

}

