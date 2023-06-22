import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        //Faça um Programa que peça uma data no formato dd/mm/aaaa e determine se a mesma é uma data válida.
        System.out.println("\nInforme uma data, na ordem de: dia, mês e ano. ");
        int dia = scanner.nextInt();
        int mes = scanner.nextInt();
        int ano = scanner.nextInt();

        if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || ano > 2023){
            System.out.println("\nA data informada não existe!");
        }
        else{
            String data = dia + "/" + mes + "/" + ano;

            System.out.println("\nData: " + data);
        }
        scanner.close();
    }
}
