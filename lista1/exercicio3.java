import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

         System.out.print("Insira o valor da sua mercadoria: ");
         int valormercadoria = leitor.nextInt();

         
        double valorrepresentante = valormercadoria * 0.20;
        double valorimposto = valormercadoria * 0.30;
        double valorvenda = valormercadoria + valorrepresentante + valorimposto;

        valorvenda = valormercadoria * 1.50;

        System.out.println("o valor de venda da mercadoria é R$ " + valorvenda);


    }
}

