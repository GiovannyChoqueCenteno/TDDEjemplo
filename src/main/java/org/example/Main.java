package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PalindromaChecker palindromaChecker = new PalindromaChecker();
        palindromaChecker.insertarPalindromo("radar");
        palindromaChecker.insertarPalindromo("HOLA");
        palindromaChecker.insertarPalindromo("HOLA");
        System.out.println(palindromaChecker);
    }


}