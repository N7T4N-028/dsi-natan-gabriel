package Exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Código do funcionário: ");
        int codigo = sc.nextInt();

        System.out.print("Sexo (M/F): ");
        char sexo = sc.next().toUpperCase().charAt(0);

        System.out.print("Tempo de trabalho (anos): ");
        int tempo = sc.nextInt();

        System.out.print("Salário: ");
        double salario = sc.nextDouble();

        // Cálculo do bônus
        double bonus;

        if (sexo == 'M' && tempo > 15) {
            bonus = salario * 0.20;
        } else if (sexo == 'F' && tempo > 10) {
            bonus = salario * 0.25;
        } else {
            bonus = 100;
        }

        // Exibição do resultado
        System.out.println("\nCódigo do funcionário: " + codigo);
        System.out.println("Bônus de Natal: R$ " + bonus);

        sc.close();
    }
}