package Aula07;

public class Explicação_conceitos {

    public static void main(String[] args) {

        // Exemplo de switch para dias da semana
        int diaSemana = 4;

        switch (diaSemana) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

        }

        // Exemplo utilizando default
        int diaAtual = 4;

        switch (diaAtual) {

            case 6:
                System.out.println("Today is Saturday");
                break;

            case 7:
                System.out.println("Today is Sunday");
                break;

            default:
                System.out.println("Looking forward to the weekend");

        }

    }
}
