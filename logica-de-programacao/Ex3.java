/*
 * Kauê Fraga Rodrigues T. 254
 * Essa é solução do exercício 3 do encontro 2 (estrutura de repeticão e condição)
 */

import java.util.Scanner;

class Ex3 {
    public static void main(String[] args) {
        float num1, num2;
        String operador;
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Calculadora ---");
        System.out.println("Operadores disponíveis:");
        System.out.println(" - Adição (+)");
        System.out.println(" - Subtração (-)");
        System.out.println(" - Multiplicação (* ou x)");
        System.out.println(" - Divisão (/)");

        System.out.print("Digite o operador: ");
        operador = scanner.nextLine();

        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextFloat();

        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextFloat();

        switch (operador) {
            case "+": System.out.println("> O resultado da adição é " + (num1 + num2));
                break;
            case "-": System.out.println("> O resultado da subtração é " + (num1 - num2));
                break;
            case "*":
            case "x": System.out.println("> O resultado da multiplicação é " + (num1 * num2));
                break;
            case "/": System.out.println("> O resultado da divisão é " + (num1 / num2));
        }

        scanner.close();
    }
}
