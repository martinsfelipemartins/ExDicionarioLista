package br.com.alunodh;

import java.util.*;

public class exDicio1 {
    public static void main(String[] args) {


        Map<Integer, String> loteriaDosSonhos = new HashMap<>();
        loteriaDosSonhos.put(0, "Ovos");
        loteriaDosSonhos.put(1, "agua");
        loteriaDosSonhos.put(2, "Escopeta");
        loteriaDosSonhos.put(3, "Cavalo");
        loteriaDosSonhos.put(4, "Dentista");
        loteriaDosSonhos.put(5, "Fogo");

        for (int chave : loteriaDosSonhos.keySet()) {
            System.out.println("Valor da loteria: " + loteriaDosSonhos.get(chave));
        }

    }}