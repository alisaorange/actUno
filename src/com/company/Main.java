package com.company;

import java.util.Arrays;

//1. Надо создать класс Alumne (ученик) который хранит фамилию и курс(1 или 2). И он должен быть Comparable.
//2. Создать класс AlumneS (ученики) который позволяет сохранять Alumne, нельзя использовать Java Collections Framework.
//Ученики будут созданы в концею.
//3. Класс AlumneS должен быть Iterable, и иметь метод для сортировки фамилий (Arrays.sort).
// Надо сделать приложение, которое создает 5 учеников, сортрует их и показывает по фамилиям с помощью iterador.
//4. Создать iterador который показывает учеников выбранного курса (в нашем случаи 2 курс).


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
