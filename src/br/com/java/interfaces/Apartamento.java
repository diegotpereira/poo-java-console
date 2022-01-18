package br.com.java.interfaces;

public class Apartamento implements Construcao, CustoConstrucao{

    private int comodos = 4;
    
    @Override
    public double calcularCusto() {
        int custo = 500000;

        return custo;
    }

    @Override
    public void especificarCONSTRUCAO() {
        System.out.println("Tipo Apartamento: ");
        
    }

    @Override
    public String toString() {

        especificarCONSTRUCAO();
        return " Custo: " + calcularCusto() + 
                 " | Quantidade de comodos " + this.comodos;
    }
    
}
