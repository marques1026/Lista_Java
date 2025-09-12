// importando

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Scanner;

public class CadastroEmprego {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        Locale localBrasil = new Locale("pt", "BR");
        NumberFormat formatadorMoeda = NumberFormat.getCurrencyInstance(localBrasil);

        String nome;
        String sobrenome;
        LocalDate dataNascimento; // tipo pra guardar datas 
        double pretensaoSalarial; // tipo pra guardar num com casa decimal
        String ensino;
        String cargo;
        String cnh;
        
        System.out.print("insira seu nome: ");
        nome = scanner.nextLine(); // le a linha q o usuario digita

        System.out.print("Insira seu sobrenome: ");
        sobrenome = scanner.nextLine();

        while (true) {
            System.out.print("Insira sua data de nascimento no formato DDMMAA: ");
            String dataNascStr = scanner.nextLine();
        try {
            DateTimeFormatter foramtadorDataEntrada = DateTimeFormatter.ofPattern(("ddMMyyyy"));
            dataNascimento = LocalDate.parse(dataNascStr, foramtadorDataEntrada);
            break;
        }catch (DateTimeParseException e) {
            System.out.println("Formato de data invalido, por favor digite apenas números no formato DDMMAAAA.");
            }
        }

        while (true) {
            System.out.print("Qual sua pretensão salarial? R$");
            String salarioStr = scanner.nextLine();
            try {
                pretensaoSalarial = Double.parseDouble(salarioStr); // converte texto p numero, no caso o double
                break;
            }catch (NumberFormatException e) {
                System.out.println("Valor invalido, digite apenas números.");
            }
        }


        while (true) {
            System.out.print("Digite um numero de acordo com a opção do grau de ensino: \n 1- Ensino médio completo \n 2- Ensino técnico ou superior \n");
            ensino = scanner.nextLine();
            
            if (ensino.equals("1") || ensino.equals("2")) {
                break;
            }else{
                System.out.println("Opção invalida, por favor insira apenas 1 ou 2.");
            }
        }

        System.out.print("Insira seu cargo pretendido: ");
        cargo = scanner.nextLine();

        while (true) {
            System.out.print("Você possui CNH tipo B? \n 1- Sim \n 2- Não \n");
            cnh = scanner.nextLine();
            if (cnh.equals("1") || cnh.equals("2")) {
                break;
            }else{
                System.out.println("Insira apenas 1 ou 2.");
            }
        }

    // imprimindo os resultados
    System.out.println("------ Cadastro realizado -----");
    System.out.println("O nome completo do candidato é: " + nome + " " + sobrenome + ".");

    DateTimeFormatter formatadorDataSaida = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    System.out.println("A data de nascimento do candidato é: " +dataNascimento.format(formatadorDataSaida));
    
    System.out.println("O cargo pretendido é: " + cargo + ".");

    if (cnh.equals("1")) {
        System.out.println("O candidato possui CNH tipo B.");
    }else{
        System.out.println("O candidato não possui CNH.");
    }

    System.out.println("Cadastro efetivado com sucesso, boa sorte!!");

    scanner.close(); // pra fechar o scanner
    }
}