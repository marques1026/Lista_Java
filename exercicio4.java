import java.util.Scanner;

public class exercicio4 {
    public static void main(String[]args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira um número inteiro: ");
        int num1 = leitor.nextInt();

        int antecessor = num1 - 1;
        int sucessor = num1 + 1;

        System.out.println("O antecessor desse número é: " + antecessor);
        System.out.println("O sucessor desse número é: " + sucessor);
    }


}