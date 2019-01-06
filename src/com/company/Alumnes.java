package com.company;

import java.util.*;
import java.util.Iterator;


public class Alumnes implements Iterable<Alumne> {


    public Alumne[] alumnes;

    //List<Alumne> list = Arrays.asList(alumnes);
    Iterable<Alumne> iter = Arrays.asList(alumnes);

    public Alumnes(Alumne[] alumnes) {
        this.alumnes = alumnes;
    }


    @Override
    public Iterator<Alumne> iterator() {
        return new Iterator<Alumne>() {
            private int pos = 0;
            @Override
            public boolean hasNext() {
                return alumnes.length > pos;
            }

            @Override
            public Alumne next() {
                return alumnes[pos++];
            }
        };
    }

    public static <T> Iterator<T> getIterator(final T[] array) {
        return new Iterator<T>() {
            private int count = array.length;
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < count;
            }


            @Override
            public T next() {
                if (index < count) {
                    return array[index++];
                } else {
                    throw new NoSuchElementException("No such element.");
                }
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Cannot remove item from array.");
            }
        };
    }


    public static void alumIter(){
        Iterator<Alumne> alumneIterator = Alumnes.getIterator(Alumne.alumnesTwo);

        while (alumneIterator.hasNext()){
            System.out.println(alumneIterator.next());
        }


    }


}
