import java.util.InputMismatchException;
import java.util.Scanner;

public class TemperatureControl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double tempMin = 0.0, tempMax = 0.0;
        double somaTemperaturas = 0.0;

        int acimaMax = 0;
        double menorTemp = Double.MAX_VALUE;
        double maiorTemp = -Double.MAX_VALUE;

        System.out.println("=== Sistema de Controle de Temperatura da Estufa ===");
        try {
            System.out.print("Informe a temperatura mínima permitida: ");
            tempMin = sc.nextDouble();

            System.out.print("Informe a temperatura máxima permitida: ");
            tempMax = sc.nextDouble();

            if (tempMax < tempMin) {
                System.out.println("Aviso: temperatura máxima menor que mínima. Invertendo valores.");
                double t = tempMax; tempMax = tempMin; tempMin = t;
            }

            System.out.println("\n--- Registro das Temperaturas por 24 horas ---");

            for (int hora = 1; hora <= 24; hora++) {
                double tempAtual = 0.0;
                boolean valid = false;
                while (!valid) {
                    try {
                        System.out.print(String.format("Temperatura da hora %02d: ", hora));
                        tempAtual = sc.nextDouble();
                        valid = true;
                    } catch (InputMismatchException ime) {
                        System.out.println("Entrada inválida. Por favor digite um número (ex: 23.5).");
                        sc.next(); // consume invalid token
                    }
                }

                somaTemperaturas += tempAtual;

                if (tempAtual > tempMax) {
                    acimaMax++;
                    System.out.println("⚠ ALERTA: Temperatura acima do limite máximo!");
                }

                if (tempAtual < tempMin || tempAtual > tempMax) {
                    System.out.println("⚠ Alerta: Temperatura fora do padrão!");
                }

                if (tempAtual < menorTemp) {
                    menorTemp = tempAtual;
                }
                if (tempAtual > maiorTemp) {
                    maiorTemp = tempAtual;
                }
            }

            double media = somaTemperaturas / 24.0;

            System.out.println("\n===== RELATÓRIO FINAL =====");
            System.out.printf("Média das temperaturas: %.2f%n", media);
            System.out.println("Quantidade acima do limite máximo: " + acimaMax);
            System.out.printf("Menor temperatura registrada: %.2f%n", menorTemp);
            System.out.printf("Maior temperatura registrada: %.2f%n", maiorTemp);

        } catch (InputMismatchException ime) {
            System.out.println("Entrada inválida. Programa finalizado.");
        } finally {
            sc.close();
        }
    }
}
