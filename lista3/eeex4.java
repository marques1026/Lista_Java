import java.util.Scanner;

public class eeex4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número final: ");
        int numero = scanner.nextInt();

        System.out.print("Digite o incremento: ");
        int incremento = scanner.nextInt();

        System.out.println("Saída do programa:");


        for (int i = 0; i <= numero; i += incremento) {
            System.out.print(i);

            // Adiciona uma vírgula se não for o último número
            if (i + incremento <= numero) {
                System.out.print(", ");
            }
        }

        System.out.println("."); // Pula uma linha no final

        scanner.close();
    }
}