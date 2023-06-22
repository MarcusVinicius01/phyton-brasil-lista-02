import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        /*Faça um Programa para leitura de três notas parciais de um aluno. O programa deve calcular a média alcançada por
        aluno e presentar:
        A mensagem "Aprovado", se a média for maior ou igual a 7, com a respectiva média alcançada;
        A mensagem "Reprovado", se a média for menor do que 7, com a respectiva média alcançada;
        A mensagem "Aprovado com Distinção", se a média for igual a 10.*/
        System.out.println("\nInforme as notas dos 3 períodos do aluno em sua ordem.");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media == 10){
            System.out.printf("\nAprovado com Distinção! Com média %.1f", media);
        }
        else if (media >= 7 && media < 10){
            System.out.printf("\nAprovado! Com média %.1f", media);
        }
        else if (media < 7 && media >= 0){
            System.out.printf("\nReprovado! Com média %.1f", media);
        }
        else {
            System.out.println("\nValores informados invalidos!");
        }
        scanner.close();
    }
}
