import java.util.Scanner;

public class exercicio6 {
    
    public static void main(String[]args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira sua primeira nota: ");
        double nota1 = leitor.nextDouble();

        System.out.print("Insira a segunda nota: ");
        double nota2 = leitor.nextDouble();

        double media = (nota1 * 0.40) + (nota2 * 0.60);

        System.out.println("A média do aluno das duas notas é: " + media);

    }
}
