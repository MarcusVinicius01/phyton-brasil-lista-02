import java.util.Date;
import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Date data = new Date();
        /*O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira:
                        Até 5 Kg                Acima de 5 Kg
        File Duplo      R$ 4,90 por Kg          R$ 5,80 por Kg
        Alcatra         R$ 5,90 por Kg          R$ 6,80 por Kg
        Picanha         R$ 6,90 por Kg          R$ 7,80 por Kg
        Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos de carne da promoção,
        porém não há limites para a quantidade de carne por cliente. Se compra for feita no cartão Tabajara o
        cliente receberá ainda um desconto de 5% sobre o total da compra. Escreva um programa que peça o tipo e
        a quantidade de carne comprada pelo usuário e gere um cupom fiscal, contendo as informações da compra:
        tipo e quantidade de carne, preço total, tipo de pagamento, valor do desconto e valor a pagar.*/
        String tipoDeCarne = "";
        double preco = 0;
        double kgDeCarne = 0;
        String formaDePagamento = "";
        double custo = 0;

        System.out.println("\nInforme o tipo de carne que deseja comprar (sendo permitido comprar apenas de um unico tipo).\n[1]File Duplo.\n[2]Alcatra.\n[3]Picanha.");
        tipoDeCarne = scanner.next();
        System.out.println("\nInforme quantos Kg de carne deseja comprar.");
        kgDeCarne = scanner.nextDouble();

        switch(tipoDeCarne){
            case "1":
            tipoDeCarne = "File Duplo";
            if (kgDeCarne <= 5){
                preco = 4.90;
            }
            else {
                preco = 5.80;
            }
            break;

            case "2":
            tipoDeCarne = "Alcatra";
            if (kgDeCarne <= 5){
                preco = 5.90;
            }
            else {
                preco = 6.80;
            }
            break;

            case "3":
            tipoDeCarne = "Picanha";
            if (kgDeCarne <= 5){
                preco = 6.90;
            }
            else {
                preco = 7.80;
            }
            break;

            default:
            System.out.println("\nResposta Invalida! Escolha entre os três tipos apresentados.");
            }
        
        custo = kgDeCarne * preco;
        double desconto = custo * 0.05;

            System.out.println("\nInforme a forma de pagamento.\n[1]Dinheiro.\n[2]Cartão Tabajara.\n[3]Cartão Crédito/Débito.");
            formaDePagamento = scanner.next();

            switch(formaDePagamento){
                case "1":
                formaDePagamento = "Dinheiro";
                break;
                case "2":
                formaDePagamento = "Cartão Tabajara";
                break;
                case "3":
                formaDePagamento = "Cartão Crédito/Débito";
                break;
                default:
                System.out.println("\nForma de pagamento invalida!");
            }
        
        System.out.printf("\n### Hipermercado Tabajara ###\n");
        System.out.println(data);
        System.out.printf("%.1f Kg de %s \n", kgDeCarne, tipoDeCarne);
        System.out.println("Forma de pagamento: " + formaDePagamento);
        System.out.printf("Valor total: R$ %.2f", custo);

        if (formaDePagamento.equals("Cartão Tabajara")){
            System.out.printf("\nDesconto: R$ %.2f", desconto);
            System.out.printf("\nValor a pagar: R$ %.2f \n", custo - desconto);
        }
        else {
            System.out.printf("\nValor a pagar: R$ %.2f \n", custo);
        }
        scanner.close();
    }
}