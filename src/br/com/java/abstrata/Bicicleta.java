package br.com.java.abstrata;

public abstract class Bicicleta {
    
    Bicicleta() {
        System.out.println("Bicicleta criada");
    }

    abstract void correr();

    public void mudarMarcha() {
        System.out.println("Marcha trocada");
    }
}
