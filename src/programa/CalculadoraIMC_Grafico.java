package programa;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class CalculadoraIMC_Grafico {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso:"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura:"));

        double imc = peso / (altura * altura);
        String formatado = String.format("%.2f ", imc);

        if (imc < 18.5) {
            JOptionPane.showMessageDialog(null, "IMC é: " + formatado + "Abaixo do peso");
        } else if (imc <= 24.9) {
            JOptionPane.showMessageDialog(null, "IMC é: " + formatado + "Peso ideal (Parabéns)");
        } else if (imc <= 29.9) {
            JOptionPane.showMessageDialog(null, "IMC é: " + formatado + "Atenção! Você está acima do peso");
        } else if (imc <= 34.9) {
            JOptionPane.showMessageDialog(null, "IMC é: " + formatado + "Obesidade grau I");
        } else if (imc <= 39.9) {
            JOptionPane.showMessageDialog(null, "IMC é: " + formatado + "Obesidade grau II (severa)");
        } else {
            JOptionPane.showMessageDialog(null, "IMC é: " + formatado + "Obesidade grau III (mórbida)");
        }

        sc.close();
    }
}

