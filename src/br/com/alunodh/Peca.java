package br.com.alunodh;


public abstract class Peca {

    private String modelo;
    private String marca;

    public Peca(String modelo, String marca) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Peca() {

    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public abstract void retirada();

}
