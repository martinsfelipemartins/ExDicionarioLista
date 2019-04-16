package br.com.alunodh;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class exDicio2 {
    public static void main(String[] args) {


    Map<String,List<String>> apelidos = new HashMap<>();

    List<String> apelidosDoJoao = new ArrayList<>();
    apelidosDoJoao.add("Juan");
    apelidosDoJoao.add("Fissura");
    apelidosDoJoao.add("Maromba");

    List<String> apelidosDoMiguel = new ArrayList<>();
    apelidosDoMiguel.add("Night Watch");
    apelidosDoMiguel.add("Bruce Wayne");
    apelidosDoMiguel.add("Tampinha");

    List<String> apelidosDaMaria = new ArrayList<>();
    apelidosDaMaria.add("Wonder Woman");
    apelidosDaMaria.add("Mary");
    apelidosDaMaria.add("Marilene");

    apelidos.put("joao", apelidosDoJoao);
    apelidos.put("Miguel", apelidosDoMiguel);
    apelidos.put("Maria", apelidosDaMaria);

    for(String chave: apelidos.keySet()){
        System.out.println("Apelidos do "+chave);
        for(String apelido:apelidos.get(chave)){
            System.out.println("\t"+apelido);
        }
    }




    }
}
