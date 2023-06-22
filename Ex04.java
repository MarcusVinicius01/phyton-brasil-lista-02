import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        //Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
        System.out.println("\nInforme uma letra qualquer, para ser identificada como vogal, ou consoante.");
        String letra = scanner.nextLine();

        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")){
            System.out.println("\nA letra digitada é uma vogal.");
        }
        else{
            System.out.println("\nA letra digitada é uma consoante.");
        }
        scanner.close();
    }
}
