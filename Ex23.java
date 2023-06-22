import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        /*Faça um Programa que peça um número e informe se o número é inteiro ou decimal. Dica: utilize uma função de
        arredondamento.*/
        System.out.println("\nInforme um número, para saber se ele é um número inteiro ou decimal.");
        double numero = scanner.nextDouble();

        if (Math.round(numero) == numero){
            System.out.println("\nO número informado é um número inteiro.");
        }
        else {
            System.out.println("\nO número informado é um número decimal.");
        }
        scanner.close();
    }
}
