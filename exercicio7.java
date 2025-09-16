import java.util.Scanner;
import java.util.Locale; // pro programa aceitar ponto e converter o numero pra virgula

public class exercicio7 {
    public static void main(String[]args){

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o nome do vendedor: ");
        String nomeVendedor = leitor.nextLine();

        System.out.print("Digite o mês de referência: ");
        String mes = leitor.nextLine();

        System.out.print("Digite o número de carros vendidos: ");
        int carrosvendidos = leitor.nextInt();

        System.out.print("Digite o valor total das vendas da loja no mês: R$ ");
        double valorTotalvendas = leitor.nextDouble();

        double salarioFixo = 1500.00;
        double comissaoPorCarro = 350.00;
        double percentualVendas = 0.00001;

        double valorComissaoCarro = carrosvendidos * comissaoPorCarro;
        double valorComissaoTotal = valorTotalvendas * percentualVendas;

        double salarioFinal = salarioFixo + valorComissaoCarro + valorComissaoTotal;

        System.out.println("\n --------------Relatório de salário do vendedor ------------------ ");
        System.out.println("Nome do vendedor: " + nomeVendedor);
        System.out.println("Mês: " + mes);
        System.out.printf("Salário fixo R$ %.2f\n", salarioFixo);
        System.out.printf("Comissão por Carros (%d carros): R$ %.2f\n", carrosvendidos, valorComissaoCarro);
        System.out.printf("Comissão sobre Vendas da Loja: R$ %.2f\n", valorComissaoTotal);
        System.out.printf("Salário final: R$ %.2f\n", salarioFinal);


        

    }


}