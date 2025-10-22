import java.util.Scanner;
import java.util.Locale; // Para usar ponto nos decimais

public class eeex7 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        // Variáveis para guardar os dados da pessoa mais alta
        String nomeMaisAlta = "";
        double alturaMaisAlta = 0.0; // Começa com 0, qualquer altura positiva vai ser maior

        // Variáveis para guardar os dados da pessoa mais pesada
        String nomeMaisPesada = "";
        double pesoMaisPesado = 0.0;

        for (int i = 0; i < 6; i++) {
            System.out.println("\n--- Pessoa " + (i + 1) + " ---");

            System.out.print("Digite o nome: ");
            String nome = scanner.next();

            System.out.print("Digite a altura (ex: 1.75): ");
            double altura = scanner.nextDouble();

            System.out.print("Digite o peso (ex: 70.5): ");
            double peso = scanner.nextDouble();

            // verifica se a pessoa atual é a mais alta até agora
            if (altura > alturaMaisAlta) {
                alturaMaisAlta = altura; // Atualiza a maior altura
                nomeMaisAlta = nome;     // Guarda o nome da pessoa
            }

            if (peso > pesoMaisPesado) {
                pesoMaisPesado = peso;
                nomeMaisPesada = nome;
            }
        }

        System.out.println("\n--- Resultados Finais ---");
        System.out.printf("Pessoa mais alta: %s com %.2fm\n", nomeMaisAlta, alturaMaisAlta);
        System.out.printf("Pessoa mais pesada: %s com %.2fkg\n", nomeMaisPesada, pesoMaisPesado);

        scanner.close();
    }
}