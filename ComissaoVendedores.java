import java.util.Scanner;

public class ComissaoVendedores {
    public static void main(String[] args) {
        Scanner calculadora = new Scanner(System.in);
        int[] contadores = new int[9];

        System.out.println("Digite as vendas brutas dos vendedores (digite -1 para encerrar):");

        while (true) {
            double vendasBrutas = calculadora.nextDouble();
            if (vendasBrutas == -1) break;

            double salario = 200 + (0.09 * vendasBrutas);


            if (salario >= 200 && salario < 300) contadores[0]++;
            else if (salario >= 300 && salario < 400) contadores[1]++;
            else if (salario >= 400 && salario < 500) contadores[2]++;
            else if (salario >= 500 && salario < 600) contadores[3]++;
            else if (salario >= 600 && salario < 700) contadores[4]++;
            else if (salario >= 700 && salario < 800) contadores[5]++;
            else if (salario >= 800 && salario < 900) contadores[6]++;
            else if (salario >= 900 && salario < 1000) contadores[7]++;
            else contadores[8]++;
        }


        System.out.println("\nDistribuição de salários:");
        System.out.println("$200 - $299: " + contadores[0]);
        System.out.println("$300 - $399: " + contadores[1]);
        System.out.println("$400 - $499: " + contadores[2]);
        System.out.println("$500 - $599: " + contadores[3]);
        System.out.println("$600 - $699: " + contadores[4]);
        System.out.println("$700 - $799: " + contadores[5]);
        System.out.println("$800 - $899: " + contadores[6]);
        System.out.println("$900 - $999: " + contadores[7]);
        System.out.println("$1000 ou mais: " + contadores[8]);

        System.out.println("\nPrograma encerrado. Obrigado por utilizar!");

        calculadora.close();
    }
}
