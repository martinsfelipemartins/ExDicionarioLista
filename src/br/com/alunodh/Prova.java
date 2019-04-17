package br.com.alunodh;

import java.util.HashSet;
import java.util.Set;

public class Prova {


    public void somaTotal(Set<Integer> conjuntoDeInteiros){
int soma=0;
        for (Integer key: conjuntoDeInteiros) {
            //System.out.println("Valor total: "+(key+soma) );
            soma = (soma + key);


        }
int somaGeral;
        somaGeral=soma;
        System.out.println(somaGeral);


    }
}
