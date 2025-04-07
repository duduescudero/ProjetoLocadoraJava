package org.example;

public class Veiculo {
    private String modelo;
    private double valorDiaria;

    public Veiculo(String modelo, double valorDiaria) {
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
    }

    public double calcularCusto(int dias) {
        if (dias <= 0 || valorDiaria < 0) {
            return 0;
        }
        double custo = dias * valorDiaria;
        if (dias >= 7) {
            custo *= 0.9; // 10% de desconto
        }
        return custo;
    }

    public double calcularMulta(int diasAtraso) {
        return diasAtraso * valorDiaria * 1.5;
    }

    public String getModelo() {
        return modelo;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }
}
