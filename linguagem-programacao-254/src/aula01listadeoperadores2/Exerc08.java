package aula01listadeoperadores2;

/*
* Desenvolva um programa que declare variáveis para armazenar duas strings. Solicite ao usuário que insira as duas
* strings e, em seguida, compare os seus tamanhos. O programa deve exibir uma mensagem indicando se o tamanho da
* primeira string é menor que o tamanho da segunda.
* */

// scanner.next -> palavra (detecta caracter de espaço)
// scanner.nextLine -> linha inteira

import java.util.Scanner;

public class Exerc08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite um texto: ");
        String string1 = s.nextLine();

        System.out.print("Digite outro texto: ");
        String string2 = s.nextLine();

        boolean primeiraMenorQueSegunda = string1.length() < string2.length();

        System.out.println("O primeiro texto é menor que o segundo: " + primeiraMenorQueSegunda);
    }
}
