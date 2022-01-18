package br.com.java.heranca;

public class ExecutaCarro {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        System.out.println(meuCarro + " " + meuCarro.getNomeDoModelo());
        meuCarro.reproduzirSomDoMotor();
    }
}
