package com.company;

import java.util.List;

public class Klasa {
    public String nazwa;
    public List<String> nazwiska;


    public Klasa(String nazwa, List<String> nazwiska) {
        this.nazwa = nazwa;
        this.nazwiska = nazwiska;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public List<String> getNazwiska() {
        return nazwiska;
    }

    public void setNazwiska(List<String> nazwiska) {
        this.nazwiska = nazwiska;
    }
}
