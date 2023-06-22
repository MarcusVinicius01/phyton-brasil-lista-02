import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        /*Faça um Programa que leia um número e exiba o dia correspondente da semana. (1-Domingo, 2- Segunda, etc.), se digitar
        outro valor deve aparecer valor inválido.*/
        System.out.println("\nDigite um número de um dia da semana, sendo de 1 (domingo) a 7 (sábado).");
        String resposta = scanner.nextLine();

        switch (resposta){
            case "1":
            System.out.println("\nVocê escolheu o domingo.");
            break;

            case "2":
            System.out.println("\nVocê escolheu a segunda-feira.");
            break;

            case "3":
            System.out.println("\nVocê escolheu a terça-feira.");
            break;

            case "4":
            System.out.println("\nVocê escolheu a quarta-feira.");
            break;

            case "5":
            System.out.println("\nVocê escolheu a quinta-feira.");
            break;

            case "6":
            System.out.println("\nVocê escolheu a sexta-feira.");
            break;

            case "7":
            System.out.println("\nVocê escolheu o sábado.");
            break;
        }
        scanner.close();
    }
}
