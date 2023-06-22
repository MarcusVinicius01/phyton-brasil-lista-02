import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        //Faça um Programa que leia três números e mostre-os em ordem decrescente.
        int maior;
        int menor;
        int meio;

        System.out.println("\nInforme o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.println("\nInforme o segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.println("\nInforme o terceiro número: ");
        int numero3 = scanner.nextInt();

        if (numero1 == numero2 || numero1 == numero3 || numero2 == numero3){
            System.out.println("\nNúmeros iguais! Informe três números diferentes.");
        }
        else{
        if (numero1 > numero2 && numero1 > numero3){
            maior = numero1;
        }
        else if (numero2 > numero1 && numero2 > numero3){
            maior = numero2;
        }
        else {
            maior = numero3;
        }

        if (numero1 < numero2 && numero1 < numero3){
            menor = numero1;
        }
        else if (numero2 < numero1 && numero2 < numero3){
            menor = numero2;
        }
        else {
            menor = numero3;
        }

        if (numero1 == maior && numero2 == menor || numero1 == menor && numero2 == maior){
            meio = numero3;
        }
        else if (numero1 == maior && numero3 == menor || numero1 == menor && numero3 == maior){
            meio = numero2;
        }
        else{
            meio = numero1;
        }
        System.out.format("\nOrdem decrescente dos números: %d, %d e %d.", maior, meio, menor);
    }
        scanner.close();
    }
}