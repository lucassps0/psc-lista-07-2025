import java.util.Scanner;

public class Investigacao {
    public static void main(String[] args) {
        Scanner interrogador = new Scanner(System.in);
        String[] perguntas = {
                "Telefonou para a vítima?",
                "Esteve no local do crime?",
                "Mora perto da vítima?",
                "Devia para a vítima?",
                "Já trabalhou com a vítima?"
        };

        int respostasPositivas = 0;

        for (String pergunta : perguntas) {
            System.out.print(pergunta + " (S/N): ");
            if (interrogador.next().equalsIgnoreCase("S")) {
                respostasPositivas++;
            }
        }

        String classificacao = (respostasPositivas == 2) ? "Suspeita" :
                (respostasPositivas >= 3 && respostasPositivas <= 4) ? "Cúmplice" :
                        (respostasPositivas == 5) ? "Assassino" : "Inocente";

        System.out.println("\nClassificação: " + classificacao);

        interrogador.close();
    }
}
