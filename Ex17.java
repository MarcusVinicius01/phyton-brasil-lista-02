import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        //Faça um Programa que peça um número correspondente a um determinado ano e em seguida informe se este ano é ou não bissexto.
        System.out.println("\nInforme o ano que deseja saber se é bissexto: ");
        int ano = scanner.nextInt();
        double resto = ano % 4;

        if (resto == 0){
            System.out.println("\n" + ano + " é um ano Bissexto.");
        }
        else if (resto != 0){
            System.out.println("\n" + ano + " não é um ano Bissexto.");
        }
        else {
            System.out.println("Número informado invalido!");
        }
        scanner.close();
    }
}
