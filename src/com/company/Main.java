package com.company;

import com.company.list.LinkedList;
import com.company.list.Node;
import org.w3c.dom.ls.LSOutput;

import java.security.spec.RSAOtherPrimeInfo;

public class Main {

    public static void main(String[] args) {
	    LinkedList lista=new LinkedList();
        lista.add(1);
        lista.add(2);
        System.out.println("El tamaño es "+lista.getSize());

        lista.add(3);
        lista.add(4);
        lista.add(5);
        //lista.delete(1);
        //int dato=lista.get(3);
        System.out.println("El tamaño es "+lista.getSize());
    int dato= lista.get(2);
        System.out.println("El numero de la posicion 2 es "+dato);
    }
}
