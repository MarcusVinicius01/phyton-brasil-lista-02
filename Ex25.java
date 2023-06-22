import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        /*Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
        "Telefonou para a vítima?"
        "Esteve no local do crime?"
        "Mora perto da vítima?"
        "Devia para a vítima?"
        "Já trabalhou com a vítima?"
        O programa deve no final emitir uma classificação sobre a participação da pessoa no
        crime. Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
        "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".*/
        System.out.println("\nRespond as seguintes perguntas apenas com 'sim' ou 'nao':\n");
        System.out.println("Telefonou para a vítima?");
        String resposta1 = scanner.nextLine();
        System.out.println("Esteve no local do crime?");
        String resposta2 = scanner.nextLine();
        System.out.println("Mora perto da vítima?");
        String resposta3 = scanner.nextLine();
        System.out.println("Devia para a vítima?");
        String resposta4 = scanner.nextLine();
        System.out.println("Já trabalhou com a vítima?");
        String resposta5 = scanner.nextLine();

        int contador = 0;
        if (resposta1.equals("sim")){
            contador = contador + 1;
        }
        else {
        }
        if (resposta2.equals("sim")){
            contador = contador + 1;
        }
        else {
        }
        if (resposta3.equals("sim")){
            contador = contador + 1;
        }
        else {
        }
        if (resposta4.equals("sim")){
            contador = contador + 1;
        }
        else {
        }
        if (resposta5.equals("sim")){
            contador = contador + 1;
        }
        else {
        }
        
        if (contador == 0 || contador == 1){
            System.out.println("\nVocê foi classificado como: Inocente.");
        }
        else if (contador == 2){
            System.out.println("\nVocê foi classificado como: Suspeito.");
        }
        else if (contador == 3 || contador == 4){
            System.out.println("\nVocê foi classificado como: Cumplice.");
        }
        else if (contador == 5){
            System.out.println("\nVocê foi classificado como: Assassino.");
        }
        else {
            System.out.println("\nHouve alguma resposta errada! Responde apenas com 'sim' ou 'nao'.");
        }
        scanner.close();
    }
}