import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        /*Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a
        decisão é sempre pelo mais barato.*/
        String nomeProduto;
        double maisBarato;

        System.out.println("\nInforme o nome e o preço do primeiro produto: ");
        String nomeProduto1 = scanner.next();
        double preco1 = scanner.nextDouble();

        System.out.println("\nInforme o nome e o preço do segundo produto: ");
        String nomeProduto2 = scanner.next();
        double preco2 = scanner.nextDouble();

        System.out.println("\nInforme o nome e o preço do terceiro produto: ");
        String nomeProduto3 = scanner.next();
        double preco3 = scanner.nextDouble();

        if (preco1 == preco2 || preco1 == preco3 || preco2 == preco3){
            System.out.println("\nPreços iguais! Informe três produtos com preços diferentes.");
        }
        else{

        if (preco1 < preco2 && preco1 < preco3){
            nomeProduto = nomeProduto1;
            maisBarato = preco1;
        }
        else if (preco2 < preco1 && preco2 < preco3){
            nomeProduto = nomeProduto2;
            maisBarato = preco2;
        }
        else {
            nomeProduto = nomeProduto3;
            maisBarato = preco3;
        }
        System.out.printf("\nO produto mais barato é o %s, custando R$ %.2f", nomeProduto, maisBarato);
    }
        scanner.close();
    }
}
