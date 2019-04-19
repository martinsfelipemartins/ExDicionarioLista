package br.com.alunodh;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*Criar a classe abstrata Peça, que contenha as variáveis marca e modelo,
        ambas de tipo String e um método abstrato chamado retirada.
        2. Criar a classe GuardaVolumes, que contenha como variável um dicionário
        e um contador que será utilizado como identificador. As chaves do
        dicionário serão Integer e, como valor, haverá uma lista de peças.
        3. Criar o método public Integer guardarPecas(List<Peca> listaDePeca) na
        Classe GuardaVolumes, que recebe uma lista de peças, adiciona essa lista
        de peças em nosso dicionário e retorna o número de identificação, ou seja,
        a chave do dicionário onde guardamos as peças, que neste caso é o nosso
        contador.
        4. Criar o método public void mostrarPecas() na Classe GuardaVolumes,
        que imprime na tela todas as peças que estão no guarda-volumes, junto
        Dicionários - exercícios
        com o número correspondente.
        5. Criar o método public void mostrarPecas(Integer numero) na Classe
        GuardaVolumes, que imprima as peças que estão associadas ao número
        recebido
        6. Criar o método public void devolverPecas(Integer numero) na Classe
        GuardaVolumes, que remova a lista de peças que esta associada ao
        número recebido.
        7. Na classe Main, criar um cenário em que alguém guarda duas peças,
        recebe o código e depois retira suas peças.*/

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
        System.out.println("Sua peça é a: " + contador );
return contador;
    }

    @Override
    public String toString() {
        return "Seu produto: "+getDicionario() + " está no guarda volumes com o seguinte número de identicação : "+ getContador()+ " está guardado." ;
    }

    public void mostrarPecas(){
        System.out.println( toString() );


    }

}
