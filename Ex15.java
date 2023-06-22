import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        /*Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores podem ser um
        triângulo. Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.
        Dicas:
        Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
        Triângulo Equilátero: três lados iguais;
        Triângulo Isósceles: quaisquer dois lados iguais;
        Triângulo Escaleno: três lados diferentes;*/
        System.out.println("\nInforme o primeiro lado do triangulo: ");
        int lado1 = scanner.nextInt();

        System.out.println("\nInforme o segundo lado do triangulo: ");
        int lado2 = scanner.nextInt();

        System.out.println("\nInforme o terceiro lado do triangulo: ");
        int lado3 = scanner.nextInt();

        int soma1 = lado1 + lado2;
        int soma2 = lado2 + lado3;
        int soma3 = lado1 + lado3;

        if (soma1 < lado3 || soma2 < lado1 || soma3 < lado2){
            System.out.println("\nO valor dos lados indica que a forma não é um triangulo.");
        }
        else{
            if (lado1 == lado2 && lado2 == lado3){
            System.out.println("\nOs lados indicam que é um Triângulo Equilátero.");
        }
        else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3){
            System.out.println("\nOs lados indicam que é um Triângulo Isósceles.");
        }
        else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3){
            System.out.println("\nOs lados indicam que é um Triângulo Escaleno.");
        }
        else {
            System.out.println("\nO valor dos lados é invalido!");
        }
        }
        scanner.close();
    }
}
