import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println(" ---- Insira um horário com a data, hora e segundos \n Exemplo: 15.32.07 ---- ");

        System.out.print("Insira a hora: ");
        int hora = leitor.nextInt();

        System.out.print("Insira os minutos: ");
        int minuto = leitor.nextInt();

        System.out.print("Insira os segundos: ");
        int segundos = leitor.nextInt();

        int conversao = (hora * 3600) + (minuto * 60) + segundos;

        System.out.println("O total dessa hora em segundos é: " + conversao);
    }
}