import java.util.Scanner;

public class eeex5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int saldoPositivo = 0;
        int saldoNegativo = 0;
        int totalPessoas = 0;
        String continuar = "";

        do {
            System.out.print("Informe o saldo da pessoa: R$ ");
            double saldo = scanner.nextDouble();

            // Classifica o saldo
            if (saldo >= 0) {
                saldoPositivo++;
            } else {
                saldoNegativo++;
            }

            totalPessoas++; // Conta mais uma pessoa

            System.out.print("Deseja informar o saldo de outra pessoa? (S/N): ");
            continuar = scanner.next();

        } while (continuar.equalsIgnoreCase("S"));

        System.out.println("\n--- Análise Final ---");
        System.out.println("Pessoas com saldo positivo (ou zero): " + saldoPositivo);
        System.out.println("Pessoas com saldo negativo: " + saldoNegativo);

        // Verifica se alguém foi registrado para evitar divisão por zero
        if (totalPessoas > 0) {
            // Calcula a porcentagem de pessoas com saldo positivo
            double percPositivo = ((double) saldoPositivo / totalPessoas) * 100.0;

            System.out.printf("Porcentagem com saldo positivo: %.2f%%\n", percPositivo);

            // Verifica a condição de risco
            if (percPositivo >= 50.0) {
                System.out.println("Status: Nenhum risco!");
            } else {
                System.out.println("Status: Risco ao banco!");
            }
        } else {
            System.out.println("Nenhum saldo foi informado.");
        }

        scanner.close();
    }
}