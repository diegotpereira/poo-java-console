package br.com.java.agregacao;



public class ExecutaEmpregado {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Porto Alegre", "RS", "BR");
        Empregado empregado = new Empregado(211, "João", endereco);

        System.out.println(empregado);
        System.out.println(empregado.endereco);
    }
}
