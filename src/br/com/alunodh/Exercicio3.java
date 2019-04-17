package br.com.alunodh;

import java.util.HashSet;
import java.util.Set;

public class Exercicio3 {

    public static void main(String[] args) {

       Set<Integer> conjuntoDeInteiros= new HashSet<>();
        conjuntoDeInteiros.add(1);
        conjuntoDeInteiros.add(2);
        conjuntoDeInteiros.add(4);

        Prova prova = new Prova();
prova.somaTotal(conjuntoDeInteiros);


    }}
