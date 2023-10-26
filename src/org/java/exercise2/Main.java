package org.java.exercise2;

import org.java.wishlist.Gift;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci una parola");
        String parola = scanner.nextLine();
        char [] chars = parola.toCharArray();

        Map<Character, Integer> listaCaratteri = new HashMap<>();

        for (char lettera : chars) {
            listaCaratteri.put(lettera , listaCaratteri.getOrDefault(lettera,0) + 1 );
        }

        System.out.println(listaCaratteri);

    }
}
