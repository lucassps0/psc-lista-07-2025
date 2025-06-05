import java.util.Scanner;

public class TemperaturaAnual {
    public static void main(String[] args) {
        Scanner termometro = new Scanner(System.in);
        double[] temperaturas = new double[12];
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        double soma = 0;

        for (int i = 0; i < 12; i++) {
            System.out.print("Digite a temperatura média de " + meses[i] + ": ");
            temperaturas[i] = termometro.nextDouble();
            soma += temperaturas[i];
        }


        double mediaAnual = soma / 12;
        System.out.println("\nMédia anual das temperaturas: " + mediaAnual + "°C");
        System.out.println("\nMeses com temperaturas acima da média anual:");
        for (int i = 0; i < 12; i++) {
            if (temperaturas[i] > mediaAnual) {
                System.out.println(meses[i] + ": " + temperaturas[i] + "°C");
            }
        }

        termometro.close();
    }
}
