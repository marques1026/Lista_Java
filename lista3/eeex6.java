import java.util.Scanner;

public class eeex6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para ver a tabuada: ");
        int numero = scanner.nextInt();

        System.out.println("--- Tabuada do " + numero + " ---");

        // for pra contar até 10
        for (int i = 0; i <= 10; i++) {
            int resultado = numero * i; // Calcula o resultado da multiplicação

            // Imprime no formato "2 x 0 = 0"
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        scanner.close();
    }
}