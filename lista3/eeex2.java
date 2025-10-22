import java.util.Scanner;

public class eeex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Contadores para as condições
        int contagemIdade = 0;
        int contagemAltura = 0;
        int contagemPeso = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("\n--- Pessoa " + (i + 1) + " ---");

            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();

            System.out.print("Digite a altura (ex: 1.75): ");
            double altura = scanner.nextDouble();

            System.out.print("Digite o peso (ex: 70.5): ");
            double peso = scanner.nextDouble();

            // a. Verifica se a idade é acima de 50
            if (idade > 50) {
                contagemIdade++;
            }

            // b. Verifica se a altura é acima de 1.60
            if (altura > 1.60) {
                contagemAltura++;
            }

            // c. Verifica se o peso é abaixo de 80
            if (peso < 80) {
                contagemPeso++;
            }
        }

        System.out.println("\n--- Resultados ---");
        System.out.println("Quantas pessoas têm idade acima de 50 anos: " + contagemIdade);
        System.out.println("Quantas pessoas têm altura acima de 1.60m: " + contagemAltura);
        System.out.println("Quantas pessoas têm peso abaixo de 80kg: " + contagemPeso);

        scanner.close(); // Fecha o scanner no final
    }
}