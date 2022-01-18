package br.com.java.wrapper;

public class ExecutaWrapper {
    public static void main(String[] args) {
        Integer meuInt = 100;
        String meuString = "Wrapper";

        System.out.println("Tamanho da String WRAPPER: " + meuString.length());
        
        String convertido = meuInt.toString();
        System.out.println("Tamanho da Integer 100: " + convertido.length());
    }
    
}
