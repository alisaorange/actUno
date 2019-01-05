package com.company;


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

    //сортировка по курсу
   /*@Override
    public int compareTo(Alumne c){
        if(curs == c.curs){
            return 0;
        }else if(curs > c.curs){
            return 1;
        }else{
            return -1;
        }
    }*/









}
