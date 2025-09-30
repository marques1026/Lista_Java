import java.util.Scanner;

public class eex1 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = leitor.nextInt();

        if (idade >= 0 && idade <= 14) {
            System.out.println("Você é uma criança.");
        } else if (idade >= 15 && idade <= 17) {
            System.out.println("Você é um adolescente.");
        } else if (idade >= 18 && idade <= 30) {
            System.out.println("Você é um jovem adulto");
        } else if (idade > 30) {
            System.out.println("Você é um adulto");
        } else {
            System.out.println("Idade inválida!");
        }

        leitor.close();
    }
}