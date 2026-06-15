package Exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Lado A: ");
        double a = sc.nextDouble();

        System.out.print("Lado B: ");
        double b = sc.nextDouble();

        System.out.print("Lado C: ");
        double c = sc.nextDouble();

        // Ordenação em ordem decrescente
        double temp;

        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }

        if (a < c) {
            temp = a;
            a = c;
            c = temp;
        }

        if (b < c) {
            temp = b;
            b = c;
            c = temp;
        }

        // Exibição dos lados ordenados
        System.out.println("\nLados ordenados: " + a + ", " + b + ", " + c);

        // Verificação do tipo de triângulo
        if (a >= b + c) {
            System.out.println("Não formam triângulo.");
        } else {

            if (a * a == b * b + c * c) {
                System.out.println("Triângulo retângulo.");
            }

            if (a * a > b * b + c * c) {
                System.out.println("Triângulo obtusângulo.");
            }

            if (a * a < b * b + c * c) {
                System.out.println("Triângulo acutângulo.");
            }

            if (a == b && b == c) {
                System.out.println("Triângulo equilátero.");
            } else if (a == b || b == c || a == c) {
                System.out.println("Triângulo isósceles.");
            }
        }

        sc.close();
    }
}