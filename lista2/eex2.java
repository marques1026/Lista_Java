import java.util.Scanner;

public class eex2 {
    public static void main(String[]args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor unitário do produto: ");
        double valorUnitario = leitor.nextDouble();

        System.out.print("Digite a quantidade desejada: ");
        int quantidade = leitor.nextInt();

        double valorTotal;

        if (quantidade <= 12) {
            valorTotal = valorUnitario * quantidade;
            System.out.println("Não há desconto para esta quantidade.");
        }else{
            double valorBruto = valorUnitario * quantidade;
            valorTotal = valorBruto * 0.90;
            System.out.println("Você ganhou um desconto de 10%!");
        }

        System.out.printf("O valor total da compra é: R$ %.2f%n", valorTotal);

        leitor.close();
    }
}