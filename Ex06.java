import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        //Faça um Programa que leia três números e mostre o maior deles.
        System.out.println("\nInforme o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.println("\nInforme o segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.println("\nInforme o terceiro número: ");
        int numero3 = scanner.nextInt();

        if (numero1 == numero2 || numero1 == numero3 || numero2 == numero3){
            System.out.println("\nNúmeros iguais! Informe três números diferentes.");
        }
        else if (numero1 > numero2 && numero1 > numero3){
            int maior = numero1;
            System.out.println("\nO maior número é o: " + maior);
        }
        else if (numero2 > numero1 && numero2 > numero3){
            int maior = numero2;
            System.out.println("\nO maior número é o: " + maior);
        }
        else {
            int maior = numero3;
            System.out.println("\nO maior número é o: " + maior);
        }
        scanner.close();
    }
}
