package aula01listadeoperadores2;

/*
* Desenvolva um programa que declare variáveis para armazenar duas strings. Solicite ao usuário que insira as duas
* strings e, em seguida, compare os seus tamanhos. O programa deve exibir uma mensagem indicando se o tamanho da
* primeira string é menor que o tamanho da segunda.
* */

// scanner.next -> palavra (detecta caracter de espaço)
// scanner.nextLine -> linha inteira

import utils.Util;

public class Exerc08 {
    public static void main(String[] args) {
        String string1 = Util.inputString("Digite um texto: ");
        String string2 = Util.inputString("Digite outro texto: ");

        boolean primeiraMenorQueSegunda = string1.length() < string2.length();

        System.out.println("O primeiro texto é menor que o segundo: " + primeiraMenorQueSegunda);
    }
}
