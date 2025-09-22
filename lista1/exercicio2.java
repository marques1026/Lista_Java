import java.util.Scanner;

public class exercicio2 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = leitor.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = leitor.nextInt();

        System.out.println("-------------------------------------------");

        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;

        System.out.println("O resultado da soma dos dois números é: " + soma);
        System.out.println("O resultado da subtração do primeiro pelo segundo número é: " + subtracao);
        System.out.println("O resultado da multiplicação dos dois números é: " + multiplicacao);


        // desafio 1
        if (numero2 != 0) {
            double divisao = (double) numero1 / numero2;
            int resto = numero1 % numero2;
            System.out.println("O resultado da divisão do primeiro pelo segundo número é: " + divisao);
            System.out.println("O resto da divisão do primeiro pelo segundo número é: " + resto);
        }else{
            System.out.println("A divisão e o resto não podem ser calculadas, pois o segundo número é 0.");
        }
        

        // desafio 2 
        double potencia = Math.pow(numero1, numero2); // a biblioteca math é pra retornar número do tipo double com casa decimal
        System.out.println("O resultado do primeiro número elevado ao segundo é: " + potencia);
    }
}


