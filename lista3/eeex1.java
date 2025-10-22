import java.util.Scanner; // Importa a classe Scanner para ler dados do usuário

public class eeex1 {

    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do teclado
        Scanner scanner = new Scanner(System.in);

        // Variáveis para contar os tipos de números
        int numerosPares = 0;
        int numerosImpares = 0;
        int numerosPositivos = 0;
        int numerosNegativos = 0;

        System.out.println("--- Coletando 10 números ---");

        // 1. FUP que peça 10 números ao usuário
        // Usamos um loop 'for' porque sabemos exatamente quantas vezes ele deve repetir (10x)
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            int numero = scanner.nextInt();

            // a. Verifica se é par ou ímpar
            if (numero % 2 == 0) {
                numerosPares++; // Incrementa o contador de pares
            } else {
                numerosImpares++; // Incrementa o contador de ímpares
            }

            // c. Verifica se é positivo ou negativo
            if (numero > 0) {
                numerosPositivos++; // Incrementa o contador de positivos
            } else if (numero < 0) {
                numerosNegativos++; // Incrementa o contador de negativos
            }
            // (Se o número for 0, ele não é nem positivo nem negativo, mas é par)
        }

        System.out.println("--- Números coletados! ---");

        int opcao;

        // Usamos um loop 'do-while' para o menu, pois ele deve aparecer
        // pelo menos uma vez e repetir até que o usuário escolha sair (opção 5)
        do {
            // Mostra o menu de opções
            System.out.println("\nO que você deseja saber?");
            System.out.println("1. Quantos números pares?");
            System.out.println("2. Quantos números ímpares?");
            System.out.println("3. Quantos negativos?");
            System.out.println("4. Quantos positivos?");
            System.out.println("5. Sair do programa");
            System.out.print("Digite sua opção: ");

            opcao = scanner.nextInt();

            // A estrutura 'switch' é perfeita para menus,
            // ela avalia a variável 'opcao' e executa o bloco 'case' correspondente
            switch (opcao) {
                case 1:
                    System.out.println("Total de números pares: " + numerosPares);
                    break; // 'break' impede que o switch continue executando os próximos cases
                case 2:
                    System.out.println("Total de números ímpares: " + numerosImpares);
                    break;
                case 3:
                    System.out.println("Total de números negativos: " + numerosNegativos);
                    break;
                case 4:
                    System.out.println("Total de números positivos: " + numerosPositivos);
                    break;
                case 5:
                    System.out.println("Saindo do programa...");
                    scanner.close(); // Fecha o scanner antes de sair
                    System.exit(0); // Encerra o programa (como pedido no item e)
                    break;
                default:
                    // 'default' é executado se nenhuma das opções anteriores for válida
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

        } while (opcao != 5); // O loop continua enquanto a opção for diferente de 5

    }
}