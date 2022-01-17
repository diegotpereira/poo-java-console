package br.com.java.agregacao;

public class Circulo {
    
    Operacao operacao;

    public double area(int raio) {

        operacao = new Operacao();

        int raizQuadrada =operacao.quadrado(raio);

        return Math.PI * raizQuadrada;
    }
}
