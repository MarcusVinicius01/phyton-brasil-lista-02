import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        /*Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre, e
        calcule a sua média. A atribuição de conceitos obedece à tabela abaixo:
        Média de Aproveitamento  Conceito
        Entre 9.0 e 10.0        A
        Entre 7.5 e 9.0         B
        Entre 6.0 e 7.5         C
        Entre 4.0 e 6.0         D
        Entre 4.0 e zero        E
        O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e a mensagem “APROVADO” se o conceito
        for A, B ou C ou “REPROVADO” se o conceito for D ou E.*/
        String conceito = "";
        String status = "";

        System.out.println("\nInforme a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("\nInforme a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;
        
        if (media == 10 && media >= 9){
            conceito = "A";
            status = "APROVADO!";
        }
        else if (media < 9 && media >= 7.5){
            conceito = "B";
            status = "APROVADO!";
        }
        else if (media < 7.5 && media >= 6){
            conceito = "C";
            status = "APROVADO!";
        }
        else if (media < 6 && media >= 4){
            conceito = "D";
            status = "REPROVADO!";
        }
        else if (media < 4 && media >= 0){
            conceito = "E";
            status = "REPROVADO!";
        }
        else {
            System.out.println("\nNotas Invalidas!");
        }
        //O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e a mensagem “APROVADO” se o conceito
        //for A, B ou C ou “REPROVADO” se o conceito for D ou E.*/
        System.out.printf("\nNotas: %.1f e %.1f.\n", nota1, nota2);
        System.out.println("Média: " + media);
        System.out.println("Conceito correspondente: " + conceito);
        System.out.println("Status do aluno: " + status);
        scanner.close();
    }
}
