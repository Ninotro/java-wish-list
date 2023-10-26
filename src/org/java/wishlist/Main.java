package org.java.wishlist;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        List <Gift> listaRegali = new ArrayList<>();

        boolean exit = false;

        while (!exit) {
            System.out.println("Vuoi inserire un nuovo regalo? y/n");
            exit = scanner.nextLine().equals("n");
            if (!exit) {
                System.out.println("Descrizione regalo");
                String description = scanner.nextLine();
                System.out.println("Destinatario?");
                String destinatary = scanner.nextLine();
                listaRegali.add(new Gift(description,destinatary));
                System.out.println("Numero di regalI:" + listaRegali.size());

            }
            FileWriter fileWriter = null;
            try {
                 fileWriter = new FileWriter("./resources/list.txt");
                fileWriter.write(listaRegali.toString());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            finally {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            }

            System.out.println(listaRegali);


        }

        scanner.close();
    }

}
