import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        /*Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por
        aluno e apresentar:
        A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
        A mensagem "Reprovado", se a média for menor do que sete;
        A mensagem "Aprovado com Distinção", se a média for igual a dez.*/
        System.out.println("\nInforme a primeira nota do aluno: ");
        double nota1 = scanner.nextDouble();
        if(nota1 > 10 || nota1 < 0){
            System.out.println("\nNota invalida! Informe uma nota entre 0 e 10.");
        }
        else{
        System.out.println("\nInforme a segunda nota do aluno: ");
        double nota2 = scanner.nextDouble();
        if(nota2 > 10 || nota2 < 0){
            System.out.println("\nNota invalida! Informe uma nota entre 0 e 10.");
        }
        else{
        
        double media = (nota1 + nota2) / 2;

        if(media == 10){
            System.out.printf("Média: %.0f. Aprovado com Distinção!", media);
        }
        else if (media >= 7){
            System.out.printf("Média: %.0f. Aluno aprovado!", media);
        }
        else{
            System.out.printf("Média: %.0f. Aluno reprovado!", media);
        }
    }
    }
        scanner.close();
    }
}