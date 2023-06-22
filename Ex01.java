import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        //Faça um Programa que peça dois números e imprima o maior deles.
        System.out.println("\nInforme o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.println("\nInforme o segundo número: ");
        int numero2 = scanner.nextInt();

        if(numero1 > numero2){
            System.out.format("\nO %d é o maior número, e o %d é o menor.", numero1, numero2);
        }
        else if (numero2 > numero1){
            System.out.format("\nO %d é o maior número, e o %d é o menor.", numero2, numero1);
        }
        else {
            System.out.println("\nOs números tem o mesmo valor.");
        }
        scanner.close();
    }
}
