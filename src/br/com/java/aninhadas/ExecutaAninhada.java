package br.com.java.aninhadas;

public class ExecutaAninhada {
    public static void main(String[] args) {
        
        ClasseA minhaClasse = new ClasseA();
        ClasseA.ClasseB minhaClasseAninhada = minhaClasse.new ClasseB();

        System.out.println(minhaClasseAninhada.somar());
    }
}
