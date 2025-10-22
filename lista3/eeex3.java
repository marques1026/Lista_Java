import java.util.Scanner;
import java.util.Locale;

public class eeex3 {

    public static void main(String[] args) {
        // Configura o Locale para usar ponto facilitando a formatação de porcentagem
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        // Contadores
        int otimo = 0;
        int bom = 0;
        int ruim = 0;
        int totalRespondentes = 0;

        String continuar = ""; // Variável para controlar o loop

        do {
            System.out.println("\nQual sua opinião sobre o filme?");
            System.out.println("1 - Ótimo");
            System.out.println("2 - Bom");
            System.out.println("3 - Ruim");
            System.out.print("Sua resposta: ");
            int opiniao = scanner.nextInt();

            // Validação de entrada (pedido nas instruções gerais)
            // Enquanto a opinião não for 1, 2 ou 3, pede para digitar novamente
            while (opiniao != 1 && opiniao != 2 && opiniao != 3) {
                System.out.println("Opção inválida! Digite 1, 2 ou 3.");
                System.out.print("Sua resposta: ");
                opiniao = scanner.nextInt();
            }

            // Incrementa os contadores de acordo com a resposta
            if (opiniao == 1) {
                otimo++;
            } else if (opiniao == 2) {
                bom++;
            } else if (opiniao == 3) {
                ruim++;
            }

            totalRespondentes++; // Incrementa o total de pessoas que responderam

            // Pergunta se o usuário deseja continuar
            System.out.print("Deseja registrar outra opinião? (S/N): ");
            continuar = scanner.next(); // Lê a próxima string (S ou N)

        } while (continuar.equalsIgnoreCase("S")); // Ignora se é "s" ou "S"

        System.out.println("\n--- Resultado da Pesquisa ---");

        // Verifica se alguém respondeu para evitar divisão por zero
        if (totalRespondentes > 0) {
            // Calcula as porcentagens
            double percOtimo = ((double) otimo / totalRespondentes) * 100.0;
            double percBom = ((double) bom / totalRespondentes) * 100.0;
            double percRuim = ((double) ruim / totalRespondentes) * 100.0;

            // Calcula a média (soma das notas / total de respondentes)
            double somaNotas = (otimo * 1) + (bom * 2) + (ruim * 3);
            double mediaNotas = somaNotas / totalRespondentes;

            System.out.printf("a. Responderam ótimo: %d (%.2f%%)\n", otimo, percOtimo);
            System.out.printf("b. Responderam bom: %d (%.2f%%)\n", bom, percBom);
            System.out.printf("c. Responderam ruim: %d (%.2f%%)\n", ruim, percRuim);
            System.out.println("d. Pessoas ao todo responderam: " + totalRespondentes);
            System.out.printf("e. Média de notas do filme: %.2f\n", mediaNotas);
        } else {
            System.out.println("Ninguém respondeu a pesquisa.");
        }

        scanner.close();
    }
}