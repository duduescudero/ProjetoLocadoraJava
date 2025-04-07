package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Locadora de Veículos ===");
        System.out.print("Modelo do veículo: ");
        String modelo = sc.nextLine();

        System.out.print("Valor da diária: ");
        double valorDiaria = sc.nextDouble();

        System.out.print("Quantidade de dias: ");
        int dias = sc.nextInt();

        Veiculo veiculo = new Veiculo(modelo, valorDiaria);
        double custo = veiculo.calcularCusto(dias);

        System.out.println("\nResumo:");
        System.out.println("Modelo: " + modelo);
        System.out.println("Dias: " + dias);
        System.out.printf("Valor total: R$%.2f\n", custo);

        sc.close();
    }
}
