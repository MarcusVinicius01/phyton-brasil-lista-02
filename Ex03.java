import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        /*Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: F - Feminino,
        M - Masculino, Sexo Inválido.*/
        System.out.println("\nInforme seu sexo biológico: \n[f]Feminino.\n[m]Masculino.");
        String sexo = scanner.nextLine();

        switch(sexo){
            case "f":
            System.out.println("\nO sexo digitado é o sexo feminino.");
            break;

            case "m":
            System.out.println("\nO sexo digitado é o sexo masculino.");
            break;

            default:
            System.out.println("\nO caracter digitado é invalido!");
        }
        scanner.close();
    }
}
