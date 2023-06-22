import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        /*As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contraram para
        desenvolver o programa que calculará os reajustes.
        Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário
        atual:
        salários até R$ 280,00 (incluindo) : aumento de 20%
        salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
        salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
        salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser realizado, informe na tela:
        o salário antes do reajuste;
        o percentual de aumento aplicado;
        o valor do aumento;
        o novo salário, após o aumento.*/
        double acrescimo;
        double porcentagem;
        double novoSalario;

        System.out.println("\nInforme seu salário atual para sabermos seu aumento: ");
        double salario = scanner.nextDouble();
        
        if (salario > 1500){
            porcentagem = 0.05;
            acrescimo = salario * porcentagem;
            novoSalario = salario + acrescimo;

            System.out.printf("\nO salário antes do reajuste: R$ %.2f", salario);
            System.out.println("\nO percentual de aumento aplicado: 5%");
            System.out.printf("O valor do aumento: R$ %.2f", acrescimo);
            System.out.printf("\nO novo salário, após o aumento: R$ %.2f", novoSalario);
        }
        else if (salario > 700 && salario <= 1500){
            porcentagem = 0.1;
            acrescimo = salario * porcentagem;
            novoSalario = salario + acrescimo;

            System.out.printf("\nO salário antes do reajuste: R$ %.2f", salario);
            System.out.println("\nO percentual de aumento aplicado: 10%");
            System.out.printf("O valor do aumento: R$ %.2f", acrescimo);
            System.out.printf("\nO novo salário, após o aumento: R$ %.2f", novoSalario);
        }
        else if (salario > 280 && salario <= 700){
            porcentagem = 0.15;
            acrescimo = salario * porcentagem;
            novoSalario = salario + acrescimo;

            System.out.printf("\nO salário antes do reajuste: R$ %.2f", salario);
            System.out.println("\nO percentual de aumento aplicado: 15%");
            System.out.printf("O valor do aumento: R$ %.2f", acrescimo);
            System.out.printf("\nO novo salário, após o aumento: R$ %.2f", novoSalario);
        }
        else if (salario <= 280 && salario > 0){
            porcentagem = 0.20;
            acrescimo = salario * porcentagem;
            novoSalario = salario + acrescimo;

            System.out.printf("\nO salário antes do reajuste: R$ %.2f", salario);
            System.out.println("\nO percentual de aumento aplicado: 20%");
            System.out.printf("O valor do aumento: R$ %.2f", acrescimo);
            System.out.printf("\nO novo salário, após o aumento: R$ %.2f", novoSalario);
        }
        else {
            System.out.println("Salário Invalido!");
        }
        scanner.close();
    }
}
