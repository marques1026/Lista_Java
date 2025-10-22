import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ColisaoTrens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Horário de partida fixo
            LocalTime horaDePartida = LocalTime.of(17, 0, 0);

            // Variáveis para armazenar os dados de entrada
            double posA;
            double posB;
            double velA;
            double velB;

            // --- Leitura das Posições ---
            while (true) {
                try {
                    System.out.print("Digite a posição do Trem A (KM): ");
                    posA = Double.parseDouble(scanner.nextLine());

                    System.out.print("Digite a posição do Trem B (KM): ");
                    posB = Double.parseDouble(scanner.nextLine());

                    // Validação de Posição
                    if (posA < 0 || posB < 0 || posA > 10000 || posB > 10000) {
                        System.out.println("O número deve ser maior ou igual a zero e menor que 10000.");
                    } else {
                        break; // Sai do loop se os valores são válidos
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Você digitou um caractere inválido.");
                    System.out.println("Por favor, digite novamente:");
                }
            }

            // --- Leitura das Velocidades ---
            while (true) {
                try {
                    System.out.print("Digite a velocidade do Trem A em Km/h (positiva, ex: 100): ");
                    velA = Double.parseDouble(scanner.nextLine());

                    System.out.print("Digite a velocidade do Trem B em Km/h (negativa, ex: -150): ");
                    velB = Double.parseDouble(scanner.nextLine());

                    if (velA > 300 || velA <= 0) {
                        System.out.println("A velocidade do Trem A deve ser positiva e no máximo 300.");
                    } else if (velB < -300 || velB >= 0) {
                        System.out.println("A velocidade do Trem B deve ser negativa e no máximo -300.");
                    } else {
                        break; // Sai do loop se as velocidades são válidas
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Você digitou um caractere inválido.");
                    System.out.println("Por favor, digite novamente:");
                }
            }

            // --- Lógica de Colisão ---

            if (posA >= posB) {
                System.out.println("\nNÃO HAVERÁ COLISÃO: Os trens estão em posições que não permitem o encontro.\n");
            } else {

                double tempoHoras = (posB - posA) / (velA - velB);
                double totalSegundos = tempoHoras * 3600;
                double pontoDeEncontro = posA + (velA * tempoHoras);

                LocalTime horarioDaColisao = horaDePartida.plusSeconds((long) Math.round(totalSegundos));
                DateTimeFormatter formatador = DateTimeFormatter.ofPattern("HH:mm:ss");
                String horarioFormatado = horarioDaColisao.format(formatador);

                System.out.printf("A colisão dos trens ocorrerá no KM %f e ocorrerá após %f segundos no horário de %s\n",
                        pontoDeEncontro, totalSegundos, horarioFormatado);
            }

            // --- Repetir ---
            System.out.print("Deseja executar novamente? (s/n): ");
            String resposta = scanner.nextLine();
            if (!resposta.equalsIgnoreCase("s")) {
                break;
            }
        }

        System.out.println("\nFIM DO PROGRAMA");
        scanner.close();
    }
}