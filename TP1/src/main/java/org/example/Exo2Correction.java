package org.example;

import java.text.Normalizer;
import java.text.Normalizer;
public class Exo2Correction {


    public static boolean isAnagram(String s1, String s2) {
        if (s1 == null || s2 == null) {
            throw new NullPointerException("Strings must not be null");
        }

        // Normalisation des chaînes de caractères
        s1 = normalizeString(s1);
        s2 = normalizeString(s2);

        // Suppression des espaces
        s1 = s1.replaceAll("\\s+", "");
        s2 = s2.replaceAll("\\s+", "");

        if (s1.length() != s2.length()) {
            return false;
        }

        int[] count = new int[Character.MAX_CODE_POINT]; // Utilisation d'un tableau de taille variable pour prendre en charge tous les caractères Unicode
        for (int i = 0; i < s1.length(); i++) {
            count[s1.codePointAt(i)]++;
            count[s2.codePointAt(i)]--;
        }
        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }
        return true;
    }

    // Méthode pour normaliser les chaînes de caractères
    private static String normalizeString(String str) {
        return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("\\p{M}", "");
    }
}

