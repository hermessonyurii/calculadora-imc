package programa;

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu peso:");
        double peso = sc.nextDouble();
        System.out.printf("Digite sua altura:");
        double altura = sc.nextDouble();


        double imc = peso / (altura * altura);


        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " m");
        System.out.printf("IMC: %.2f%n", imc);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc <= 24.9) {
            System.out.println("Peso ideal (parabéns)");
        } else if (imc <= 29.9) {
            System.out.println("Atenção! Você está acima do peso");
        } else if (imc <= 34.9) {
            System.out.println("Obesidade grau I");
        } else if (imc <= 39.9) {
            System.out.println("Obesidade grau II (severa)");
        } else {
            System.out.println("Obesidade grau III (mórbida)");
        }

        sc.close();
    }
}

