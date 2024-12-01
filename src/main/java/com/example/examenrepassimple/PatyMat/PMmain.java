package com.example.examenrepassimple.PatyMat;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PMmain {
    public static void main(String[] args) {
        String frase = "Eres un datil i un abobat.";
        String regex = "(datil|abobat)";

        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(frase);

        String fraseCensurada = matcher.replaceAll("****");
        System.out.println("Censura: " + fraseCensurada);

    }
}
