import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        /*Um posto está vendendo combustíveis com a seguinte tabela de descontos:
        Álcool:
        até 20 litros, desconto de 3% por litro
        acima de 20 litros, desconto de 5% por litro
        Gasolina:
        até 20 litros, desconto de 4% por litro
        acima de 20 litros, desconto de 6% por litro Escreva um algoritmo que leia o número de litros vendidos, o tipo de
        combustível (codificado da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente
        sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço do litro do álcool é R$ 1,90.*/
        double preco = 0;
        double custo = 0;
        double desconto = 0;
        String tipoDeCombustivel = "";

        System.out.println("\nInforme quantos litros de combustível deseja comprar: ");
        double litros = scanner.nextDouble();

        do {
            System.out.println("\nAgora, informe o tipo de combustível que deseja comprar: \n[a]Álcool.\n[g]Gasolina.");
            tipoDeCombustivel = scanner.next();

            switch(tipoDeCombustivel){
            case "a":
            preco = 1.90;
            if (litros <= 20){
                desconto = 0.03;
            }
            else if (litros > 20){
                desconto = 0.05;
            }
            custo = (litros * preco) - (litros * desconto);
            System.out.printf("\nO custo total do combustível é de: R$ %.2f", custo);
            break;

            case "g":
            preco = 2.50;
            if (litros <= 20){
                desconto = 0.04;
            }
            else if (litros > 20){
                desconto = 0.06;
            }
            custo = (litros * preco) - (litros * desconto);
            System.out.printf("\nO custo total do combustível é de: R$ %.2f", custo);
            break;

            default:
            System.out.println("\nResposta invalida!");
        }
        }while(!tipoDeCombustivel.equals("a") && !tipoDeCombustivel.equals("g"));
        scanner.close();
    }
}

