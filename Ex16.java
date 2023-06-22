import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        /*Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax2 + bx + c. O programa deverá
        pedir os valores de a, b e c e fazer as consistências, informando ao usuário nas seguintes situações:
        Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o programa não deve fazer pedir
        os demais valores, sendo encerrado;
        Se o delta calculado for negativo, a equação não possui raizes reais. Informe ao usuário e encerre o programa;
        Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe-a ao usuário;
        Se o delta for positivo, a equação possui duas raiz reais; informe-as ao usuário;*/
        System.out.println("\nInforme o número que vai ficar no lugar de 'a': ");
        double a = scanner.nextInt();
        if (a == 0){
            System.out.println("\nA equação não é de segundo grau!");
        }
        else {
            System.out.println("\nInforme o número que vai ficar no lugar de 'b': ");
        double b = scanner.nextInt();

        System.out.println("\nInforme o número que vai ficar no lugar de 'c': ");
        double c = scanner.nextInt();

        double delta = Math.pow(b, 2) + (- 4 * a * c);

        if (delta < 0){
            System.out.println("\nA equação não possui raizes reais!");
        }
        else if (delta == 0){
            double x = -b / (2 * a);
            System.out.println("\nA equação possui apenas uma raiz real: " + x);
        }
        else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("\nA equação possui duas raízes reais: " + x1 + " e " + x2);
        }
        }
        scanner.close();
    }
}
