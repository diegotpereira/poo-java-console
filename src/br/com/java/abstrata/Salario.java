package br.com.java.abstrata;

public class Salario extends Empregado {

    private double salarioAnual;

    

    public Salario(String nome, String endereco, int codigo, double salarioAnual) {
        super(nome, endereco, codigo);
        this.salarioAnual = salarioAnual;
    }

    @Override
    public double computarPagamento() {
        System.out.println("Calculando pagamento para " + getNome());

        return salarioAnual / 12;
    }
    
    public void checar() {
        System.out.println("O empregado " + getNome() + " recebe anualmente " + salarioAnual);
    } 

    public double getSalarioAnual() {

        return salarioAnual;
    }

    public void setSalarioAnual(double salarioAnual) {

        if (salarioAnual >= 0) {
            this.salarioAnual = salarioAnual;
        }
    }
}
