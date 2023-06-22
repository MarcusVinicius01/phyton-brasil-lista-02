import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        /*Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao usuário a valor do saque e depois
        informar quantas notas de cada valor serão fornecidas. As notas disponíveis serão as de 1, 5, 10, 50 e 100 reais.
        O valor mínimo é de 10 reais e o máximo de 600 reais. O programa não deve se preocupar com a quantidade de notas
        existentes na máquina.
        Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece duas notas de 100, uma nota de 50, uma nota de 5 e
        uma nota de 1;
        Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece três notas de 100, uma nota de 50, quatro notas
        de 10, uma nota de 5 e quatro notas de 1.*/
        int notasDe100;
        int notasDe50;
        int notasDe10;
        int notasDe5;
        int notasDe1;

        int restoDe100;
        int restoDe50;
        int restoDe10;
        int restoDe5;

        System.out.println("\nInforme quanto deseja sacar (mínimo de 10 e máximo de 600 reais).");
        int saque = scanner.nextInt();

        if (saque < 10 || saque > 600){
            System.out.println("\nO valor do saque informado é invalido!");
        }
        else {
            notasDe100 = saque / 100;
            restoDe100 = saque % 100;

            notasDe50 = restoDe100 / 50;
            restoDe50 = restoDe100 % 50;

            notasDe10 = restoDe50 / 10;
            restoDe10 = restoDe50 % 10;

            notasDe5 = restoDe10 / 5;
            restoDe5 = restoDe10 % 5;

            notasDe1 = restoDe5 / 1;

            System.out.format("\nPara sacar a quantia de R$ %d, o caixa eletrônico fornecerá: \n%d notas de R$100 reais;\n%d notas de R$50 reais;\n%d notas de R$10 reais;\n%d notas de R$5 reais;\n%d notas de R$1 real.", saque, notasDe100, notasDe50, notasDe10, notasDe5, notasDe1);
        }
        scanner.close();
    }
}
