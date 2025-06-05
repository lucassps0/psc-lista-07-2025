import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class AnaliseNotas {
    public static void main(String[] args) {
        Scanner avaliador = new Scanner(System.in);
        List<Double> notas = new ArrayList<>();
        double soma = 0;
        System.out.println("Digite as notas (-1 para encerrar):");
        while (true) {
            double nota = avaliador.nextDouble();
            if (nota == -1) break;
            notas.add(nota);
            soma += nota;
        }
        int quantidade = notas.size();
        double media = soma / quantidade;
        System.out.println("\nQuantidade de notas lidas: " + quantidade);
        System.out.println("Notas na ordem informada: " + notas);
        System.out.println("\nNotas na ordem inversa:");
        Collections.reverse(notas);
        for (double nota : notas) {
            System.out.println(nota);
        }
        System.out.println("\nSoma das notas: " + soma);
        System.out.println("Média das notas: " + media);
        int acimaDaMedia = 0, abaixoDeSete = 0;
        for (double nota : notas) {
            if (nota > media) acimaDaMedia++;
            if (nota < 7) abaixoDeSete++;
        }
        System.out.println("\nQuantidade de notas acima da média: " + acimaDaMedia);
        System.out.println("Quantidade de notas abaixo de sete: " + abaixoDeSete);
        System.out.println("\nPrograma encerrado. Obrigado por usar o sistema!");

        avaliador.close();
    }
}
