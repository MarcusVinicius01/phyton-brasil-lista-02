import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        /*Faça um Programa que peça um número inteiro e determine se ele é par ou impar. Dica: utilize o operador módulo
        (resto da divisão).*/
        System.out.println("\nInforme um número inteiro para saber se ele é par ou impar.");
        int numero = scanner.nextInt();

        int resto = numero % 2;

        if (resto == 0){
            System.out.format("\nO número %d é um número par.", numero);
        }
        else {
            System.out.format("\nO número %d é um número impar.", numero);
        }
        scanner.close();
    }
}
