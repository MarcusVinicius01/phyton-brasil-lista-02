import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        //Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.

        System.out.println("\nInforme um número para descobrir se ele é negativo ou positivo.");
        double numero = scanner.nextDouble();
        //Math.sign
        double sinal = Math.signum(numero);

        if(sinal == 1){
            System.out.printf("\nO número %.0f é positivo.", numero);
        }
        else{
            System.out.printf("\nO número %.0f é negativo.", numero);
        }
        scanner.close();
    }
}
