package com.company;


import java.util.Arrays;

public class Alumne implements Comparable<Alumne> {

    private String lastname;
    private int curs;

    public Alumne(String lastname, int curs) {
        this.lastname = lastname;
        this.curs = curs;
    }


    @Override
    public String toString() {
        return "Lastname : " + lastname + '\'' +
                ", and Curs : " + curs ;
    }

    //сортировка по фамилии
    @Override
    public int compareTo(Alumne o) {
        return toString().compareTo(o.toString());
    }

    /*   //сортировка по курсу
   @Override
    public int compareTo(Alumne c){
        if(curs == c.curs){
            return 0;
        }else if(curs > c.curs){
            return 1;
        }else{
            return -1;
        }
    }*/
    public static void MassivOne() {

        Alumne[] alumnes = {
                new Alumne("Kolosova", 2),
                new Alumne("Ivanov", 1),
                new Alumne("Petrova", 1),
                new Alumne("Kozlov", 2),
                new Alumne("Gudok", 2)
        };

        Arrays.sort(alumnes);

        for (int i = 0; i < 5; i++) {
            System.out.println(alumnes[i]);
        }

    }


   public static Alumne[] alumnesTwo = {
                new Alumne("Pomidorka", 1),
                new Alumne("Ogurchik", 2),
                new Alumne("Sosisa", 2),
                new Alumne("Masko",1),
                new Alumne("Luk",2)
        };



    /*public static void MassivTwo(){

        Alumne[] alumnesTwo = {
                new Alumne("Pomidorka", 1),
                new Alumne("Ogurchik", 2),
                new Alumne("Sosisa", 2),
                new Alumne("Myasko",1),
                new Alumne("Luk",2)
        };

        Arrays.sort(alumnesTwo);

        for (int i=0; i < 5; i++){
            System.out.println(alumnesTwo[i]);
        }

    }*/






}
