import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        /*Faça um Programa que leia um número inteiro menor que 1000 e imprima a quantidade de centenas, dezenas e unidades
        do mesmo.
        Observando os termos no plural a colocação do "e", da vírgula entre outros. Exemplo:
        326 = 3 centenas, 2 dezenas e 6 unidades
        12 = 1 dezena e 2 unidades Testar com: 326, 300, 100, 320, 310,305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16*/
        System.out.println("\nInforme um número inteiro entre 0 e mil.");
        int numero = scanner.nextInt();

        int centenas = numero / 100;
        int restoCentenas = numero % 100;
        int dezenas = restoCentenas / 10;
        int restoDezenas = restoCentenas % 10;
        int unidades = restoDezenas / 1;

        String escritaCentenas = "";
        String escritaDezenas = "";
        String escritaUnidades = "";

        if (centenas == 1){
            escritaCentenas = "centena";
        }
        else{
            escritaCentenas = "centenas";
        }

        if (dezenas == 1){
            escritaDezenas = "dezena";
        }
        else{
            escritaDezenas = "dezenas";
        }

        if (unidades == 1){
            escritaUnidades = "unidade";
        }
        else{
            escritaUnidades = "unidades";
        }

        if (dezenas == 0 && unidades == 0){
            System.out.format("\n%d = %d %s.", numero, centenas, escritaCentenas);
        }
        else if (centenas == 0 && unidades == 0){
            System.out.format("\n%d = %d %s.", numero, dezenas, escritaDezenas);
        }
        else if (centenas == 0 && dezenas == 0){
            System.out.format("\n%d = %d %s.", numero, unidades, escritaUnidades);
        }

        else if (centenas == 0){
            System.out.format("\n%d = %d %s e %d %s.", numero, dezenas, escritaDezenas, unidades, escritaUnidades);
        }
        else if (dezenas == 0){
            System.out.format("\n%d = %d %s e %d %s.", numero, centenas, escritaCentenas, unidades, escritaUnidades);
        }
        else if (unidades == 0){
            System.out.format("\n%d = %d %s e %d %s.", numero, centenas, escritaCentenas, dezenas, escritaDezenas);
        }

        else {
            System.out.format("\n%d = %d %s, %d %s e %d %s.", numero, centenas, escritaCentenas, dezenas, escritaDezenas, unidades, escritaUnidades);
        }
        scanner.close();
    }
}