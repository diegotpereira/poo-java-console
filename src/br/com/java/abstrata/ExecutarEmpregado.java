package br.com.java.abstrata;

public class ExecutarEmpregado {
    public static void main(String[] args) {
        Empregado empregado = new Salario("Maria", "Cabral", 555, 3000);

        System.out.println(empregado);
        empregado.computarPagamento();
        System.out.println("------------------------------------------");

        Salario salario = new Salario("John", "Adams", 222, 24000);
        System.out.println(salario);
        salario.computarPagamento();
        salario.checar();

        System.out.println("-------------------------------------------");
        
    }
}
