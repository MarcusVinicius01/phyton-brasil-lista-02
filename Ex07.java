import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        //Faça um Programa que leia três números e mostre o maior e o menor deles.
        int maior;
        int menor;

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
        System.out.format("\nO maior número é o %d e o menor é o %d.", maior, menor);
    }
        scanner.close();
    }
}
