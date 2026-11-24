package programa;

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite o primeiro numero: ");
        double num1 = sc.nextDouble();
        System.out.printf("Digite o segundo numero: ");
        double num2 = sc.nextDouble();

        System.out.println("Escolha qual operação (+, -, *, /):");
        String operacao = sc.next();

        double resultado = 0;
        boolean operacaoValida = true;

        if (operacao.equals("+")) {
            resultado = num1 + num2;
        } else if (operacao.equals("-")) {
            resultado = num1 - num2;
        } else if (operacao.equals("*")) {
            resultado = num1 * num2;
        } else if (operacao.equals("/")) {
            if (num2 != 0) {
                resultado = num1 / num2;
            } else {
                System.out.println("Erro: não é possível dividir por zero.");
                operacaoValida = false;
            }
        } else {
            System.out.println("Operação inválida.");
            operacaoValida = false;
        }

        if (operacaoValida) {
            System.out.printf("Resultado: %.2f%n", resultado);
        }

        sc.close();
    }
}