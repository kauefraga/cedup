package aula01listadeoperadores2;

/*
* Desenvolva um programa que declare variáveis para armazenar duas palavras. Peça ao usuário que insira as palavras e,
* em seguida, compare a quantidade de letras de cada uma. O programa deve exibir uma mensagem indicando se a primeira
* palavra possui mais letras do que a segunda.
* */

import utils.Util;

import java.util.Scanner;

public class Exerc10 {
    public static void main(String[] args) {
        String palavra1 = Util.inputPalavraMinuscula("Digite uma palavra: ");
        String palavra2 = Util.inputPalavraMinuscula("Digite outra palavra: ");

        boolean primeiraMaisLetras = palavra1.length() > palavra2.length();

        System.out.println("A primeira palavra tem mais letras do que a segunda" + primeiraMaisLetras);
    }
}
