import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        /*Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação ele deseja realizar. O resultado
        da operação deve ser acompanhado de uma frase que diga se o número é:
        par ou ímpar;
        positivo ou negativo;
        inteiro ou decimal.*/
        System.out.println("\nInforme o primeiro número.");
        double numero1 = scanner.nextDouble();
        System.out.println("\nInforme o segundo número.");
        double numero2 = scanner.nextDouble();

        System.out.println("\nAgora, informe o sinal da operação que deseja realizar.\n[+]Soma\n[-]Subtração\n[*]Multiplicação\n[/]Divisão");
        String sinal = scanner.next();

        double resultado = 0;

        switch (sinal){
            case "+":
            resultado = numero1 + numero2;
            break;
            case "-":
            resultado = numero1 - numero2;
            break;
            case "*":
            resultado = numero1 * numero2;
            break;
            case "/":
            resultado = numero1 / numero2;
            break;
            default:
            System.out.println("\nInformações informadas invalidas!");
        }
        String status1 = "";
        String status2 = "";
        String status3 = "";

        if (resultado % 2 == 0){
            status1 = "par";
        }
        else {
            status1 = "impar";
        }

        if (Math.signum(resultado) == 1){
            status2 = "positivo";
        }
        else {
            status2 = "negativo";
        }

        if (Math.round(resultado) == resultado){
            status3 = "inteiro";
        }
        else {
            status3 = "decimal";
        }
        System.out.printf("\nO resultado da operação de %.0f %s %.0f é %.1f.\nEseu resultado é um número: %s, %s e %s.\n", numero1, sinal, numero2, resultado, status1, status2, status3);
        scanner.close();
    }
}
