package com.company;


public class Main {

    // W systemie przechowujemy nazwe klasy (szkolnej, np 1a, 2b) oraz listę osób
    // (same nazwiska jako Stringi) które uczeszczaja do klasy.
    // 1) Napisz metode ktora zwraca liste osob o najdluzszych nazwiskach z kazdej klasy
    // 2) Napisz metode która zwraca osobe o najdluzszym nazwisku ze wzystkich klas


    public static void main(String[] args) {
        Met met = new Met();
        // 1) Napisz metode ktora zwraca liste osob o najdluzszych nazwiskach z kazdej klasy
        System.out.println(met.get2LongestLastNames());
        // 2) Napisz metode która zwraca osobe o najdluzszym nazwisku ze wzystkich klas
        System.out.println(met.getLongestLastNames());
    }
}
