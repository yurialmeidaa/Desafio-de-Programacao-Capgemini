package br.com.desafio;

import java.util.*;

public class Questao03 {

    public static void main(String args[])
    {

        String s = "ifailuhkqq";

        ArrayList<String> anagrama = new ArrayList<String>();

        for(int i = 0; i < s.length(); i++) {
            for(int j = 1; j < s.length(); j++) {
                if(s.charAt(i) == s.charAt(j) && i !=j && i < j) {
                    if(s.charAt(i) == s.charAt(i+1)) {
                        String x = s.substring(i, i + 1);
                        anagrama.add(x);

                    } else {
                        String y = s.substring(i, j);
                        String z = s.substring(i + 1, j + 1);
                        String w = s.substring(i, i + 1);
                        anagrama.add(w);
                        anagrama.add(y);
                        anagrama.add(z);
                    }
                }
            }
        }

        System.out.println(anagrama.size());

    }
}




