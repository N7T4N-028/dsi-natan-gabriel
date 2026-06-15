package Exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Horas trabalhadas: ");
        double horas = sc.nextDouble();

        System.out.print("Valor por hora: ");
        double valorHora = sc.nextDouble();

        System.out.print("Quantidade de filhos menores de 14 anos: ");
        int filhos = sc.nextInt();

        System.out.print("Idade: ");
        int idade = sc.nextInt();

        System.out.print("Tempo de serviço: ");
        int tempoServico = sc.nextInt();

        // Valor do salário família por filho
        double salarioFamiliaValor = 50.0;

        double salarioBruto = horas * valorHora;
        double inps = salarioBruto * 0.085;
        double salarioFamilia = filhos * salarioFamiliaValor;

        // Cálculo do Imposto de Renda
        double ir;

        if (salarioBruto > 1500) {
            ir = salarioBruto * 0.15;
        } else if (salarioBruto > 500) {
            ir = salarioBruto * 0.08;
        } else {
            ir = 0;
        }

        // Cálculo do adicional
        double adicional = 0;

        if (idade > 40) {
            adicional = salarioBruto * 0.02;
        }

        if (tempoServico > 15) {
            adicional = salarioBruto * 0.035;
        } else if (tempoServico > 5 && idade > 30) {
            adicional = salarioBruto * 0.015;
        }

        // Cálculo do salário líquido
        double descontos = inps + ir;
        double salarioLiquido = salarioBruto - descontos + adicional + salarioFamilia;

        System.out.println("\nFuncionário: " + nome);
        System.out.println("Salário Bruto: R$ " + salarioBruto);
        System.out.println("Total de Descontos: R$ " + descontos);
        System.out.println("Adicional: R$ " + adicional);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);

        sc.close();
    }
}