import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        /*Uma fruteira está vendendo frutas com a seguinte tabela de preços:
                        Até 5 Kg           Acima de 5 Kg
        Morango         R$ 2,50 por Kg     R$ 2,20 por Kg
        Maçã            R$ 1,80 por Kg     R$ 1,50 por Kg

        Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá ainda um
        desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade
        (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.*/
        System.out.println("\nInforme a quantidade de Morangos (em Kg) qua deseja comprar: ");
        double kgMorango = scanner.nextDouble();
        System.out.println("\nInforme a quantidade de Maçãs (em Kg) qua deseja comprar: ");
        double kgMaca = scanner.nextDouble();
        
        double kgTotal = kgMaca + kgMorango;
        double precoMaca = 0;
        double precoMorango = 0;
        double custo = 0;
        double desconto = 0.10;

        if (kgMorango <= 5){
            precoMorango = 2.50;
        }
        else if (kgMorango > 5){
            precoMorango = 2.20;
        }

        if (kgMaca <= 5){
            precoMaca = 1.80;
        }
        else if (kgMaca > 5){
            precoMaca = 1.50;
        }

        custo = (precoMaca * kgMaca) + (precoMorango * kgMorango);

        if (kgTotal > 8 || custo > 25){
            custo = custo - (custo * desconto);
            System.out.printf("\nO total a pagar é de: R$ %.2f", custo);
        }
        else {
            System.out.printf("\nO total a pagar é de: R$ %.2f", custo);
        }
        scanner.close();
    }
}