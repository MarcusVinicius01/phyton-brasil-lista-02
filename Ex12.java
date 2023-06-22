import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        /*Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda, que
        depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário
        Bruto, mas não é descontado (é a empresa que deposita). O Salário Líquido corresponde ao Salário Bruto menos os
        descontos. O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
        Desconto do IR:
        Salário Bruto até 900 (inclusive) - isento
        Salário Bruto até 1500 (inclusive) - desconto de 5%
        Salário Bruto até 2500 (inclusive) - desconto de 10%
        Salário Bruto acima de 2500 - desconto de 20% Imprima na tela as informações, dispostas conforme o exemplo abaixo.
        No exemplo o valor da hora é 5 e a quantidade de hora é 220.

        Salário Bruto: (5 * 220)        : R$ 1100,00
        (-) IR (5%)                     : R$   55,00
        (-) INSS ( 10%)                 : R$  110,00
        FGTS (11%)                      : R$  121,00
        Total de descontos              : R$  165,00
        Salário Liquido                 : R$  935,00*/
        System.out.println("\nInforme quanto você ganha por hora: ");
        double valorPorHora = scanner.nextDouble();

        System.out.println("\nInforme quantas horas voce trabalhou este mês: ");
        double horasTrabalhadas = scanner.nextDouble();

        double salarioBruto = horasTrabalhadas * valorPorHora;
        double ir = 0;
        double inss = salarioBruto * 0.1;
        double fgts = salarioBruto * 0.11;
        

        if (salarioBruto <= 900 && salarioBruto > 0){
            double totalDeDescontos = ir + inss;
            double salarioLiquido = salarioBruto - totalDeDescontos;
            System.out.printf("\nSalário Bruto: R$ %.2f", salarioBruto);
            System.out.println("\n(-) IR: Isento.");
            System.out.printf("(-) INSS: R$ %.2f", inss);
            System.out.printf("\nFGTS: R$ %.2f", fgts);
            System.out.printf("\nTotal de descontos: R$ %.2f", totalDeDescontos);
            System.out.printf("\nSalário Liquido: R$ %.2f", salarioLiquido);
        }
        else if (salarioBruto > 900 && salarioBruto <= 1500){
            ir = salarioBruto * 0.05;
            double totalDeDescontos = ir + inss;
            double salarioLiquido = salarioBruto - totalDeDescontos;

            System.out.printf("\nSalário Bruto: R$ %.2f", salarioBruto);
            System.out.printf("\n(-) IR: R$ %.2f", ir);
            System.out.printf("\n(-) INSS: R$ %.2f", inss);
            System.out.printf("\nFGTS: R$ %.2f", fgts);
            System.out.printf("\nTotal de descontos: R$ %.2f", totalDeDescontos);
            System.out.printf("\nSalário Liquido: R$ %.2f", salarioLiquido);
        }
        else if (salarioBruto > 1500 && salarioBruto <= 2500){
            ir = salarioBruto * 0.1;
            double totalDeDescontos = ir + inss;
            double salarioLiquido = salarioBruto - totalDeDescontos;

            System.out.printf("\nSalário Bruto: R$ %.2f", salarioBruto);
            System.out.printf("\n(-) IR: R$ %.2f", ir);
            System.out.printf("\n(-) INSS: R$ %.2f", inss);
            System.out.printf("\nFGTS: R$ %.2f", fgts);
            System.out.printf("\nTotal de descontos: R$ %.2f", totalDeDescontos);
            System.out.printf("\nSalário Liquido: R$ %.2f", salarioLiquido);
        }
        else if (salarioBruto > 2500){
            ir = salarioBruto * 0.2;
            double totalDeDescontos = ir + inss;
            double salarioLiquido = salarioBruto - totalDeDescontos;

            System.out.printf("\nSalário Bruto: R$ %.2f", salarioBruto);
            System.out.printf("\n(-) IR: R$ %.2f", ir);
            System.out.printf("\n(-) INSS: R$ %.2f", inss);
            System.out.printf("\nFGTS: R$ %.2f", fgts);
            System.out.printf("\nTotal de descontos: R$ %.2f", totalDeDescontos);
            System.out.printf("\nSalário Liquido: R$ %.2f", salarioLiquido);
        }
        else {
            System.out.println("\nInformações de salário invalidas!");
        }
        scanner.close();
    }
}