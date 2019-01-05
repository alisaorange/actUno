package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

       Alumne[] alumnes = {
               new Alumne("Kolosova", 2),
               new Alumne("Ivanov", 1),
               new Alumne("Petrova", 1),
               new Alumne("Kozlov",2),
               new Alumne("Gudok",2)
       };

        Arrays.sort(alumnes);

        for (int i=0; i < 5; i++){
            System.out.println(alumnes[i]);
        }

       // System.out.println(Arrays.asList(alumnes));



    }

}
