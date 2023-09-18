package org.example;

import java.util.ArrayList;

public class PalindromaChecker {
    ArrayList<String> palabras;

    public PalindromaChecker() {
        palabras = new ArrayList<>();
    }

    public void insertarPalindromo(String palabra) {
        if (esPalindroma(palabra)) {
            palabras.add(palabra);
        }

    }

    public ArrayList<String> getPalabras() {
        return palabras;
    }

    public boolean esPalindroma(String palabra) {
        if (palabra.isEmpty())
            return false;
        palabra = palabra.replaceAll("\\s", "").toLowerCase();

        int left = 0;
        int right = palabra.length() - 1;

        while (left < right) {
            if (palabra.charAt(left) != palabra.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (String palabra : palabras) {
            s.append(palabra).append(",");
        }
        return s.toString();
    }
}
