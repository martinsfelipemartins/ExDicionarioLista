package br.com.alunodh;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaVolumes {

    private Map<Integer, List<Peca>> dicionario=new HashMap<>();



    public GuardaVolumes(Map<Integer, List<Peca>> dicionario, int contador) {
        this.dicionario = dicionario;
        this.contador = contador;
    }

    private int contador;


    public Map<Integer, List<Peca>> getDicionario() {
        return dicionario;
    }

    public void setDicionario(Map<Integer, List<Peca>> dicionario) {
        this.dicionario = dicionario;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public Integer guardarPecas(List<Peca> listaDePeca){
        this.dicionario.put(contador,listaDePeca);

return contador;
    }


}
