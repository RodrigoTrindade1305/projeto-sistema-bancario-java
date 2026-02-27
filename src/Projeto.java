import java.util.Locale;
import java.util.Scanner;

public class Projeto {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        String nome = "Rodrigo Trindade";
        String tipoConta = "Conta Corrente";
        double saldo = 3000.00;

        int operacao = 0;

        // Cabeçalho (aparece só uma vez)
        System.out.println("=================================");
        System.out.println("        SISTEMA BANCÁRIO         ");
        System.out.println("=================================");
        System.out.println("Cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.printf("Saldo inicial: R$ %.2f%n", saldo);
        System.out.println("=================================");

        while (operacao != 4) {

            System.out.println("\nMENU");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            operacao = scanner.nextInt();

            System.out.println("---------------------------------");

            switch (operacao) {

                case 1:
                    System.out.printf("Saldo atual: R$ %.2f%n", saldo);
                    break;

                case 2:
                    System.out.print("Digite o valor a receber: ");
                    double valorReceber = scanner.nextDouble();

                    if (valorReceber > 0) {
                        saldo += valorReceber;
                        System.out.printf("Valor recebido com sucesso!%n");
                        System.out.printf("Saldo atualizado: R$ %.2f%n", saldo);
                    } else {
                        System.out.println("Valor inválido!");
                    }
                    break;

                case 3:
                    System.out.print("Digite o valor a transferir: ");
                    double valorTransferir = scanner.nextDouble();

                    if (valorTransferir <= 0) {
                        System.out.println("Valor inválido!");
                    } else if (valorTransferir > saldo) {
                        System.out.println("Saldo insuficiente!");
                    } else {
                        saldo -= valorTransferir;
                        System.out.println("Transferência realizada com sucesso!");
                        System.out.printf("Saldo atualizado: R$ %.2f%n", saldo);
                    }
                    break;

                case 4:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

            System.out.println("---------------------------------");
        }

        scanner.close();
    }
}