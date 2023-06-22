import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        //Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-Vespertino ou
        //N- Noturno. Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.
        System.out.println("\nInforme em que turno você estuda. Sendo eles:\nm-Matutino.\nv-Vespertino.\nn- Noturno.");
        String resposta = scanner.nextLine();

        switch (resposta){
            case "m":
            System.out.println("\nBom dia!");
            break;

            case "v":
            System.out.println("\nBoa Tarde!");
            break;

            case "n":
            System.out.println("\nBoa Noite!");
            break;

            default:
            System.out.println("\nValor Inválido!");
        }
        scanner.close();
    }
}
