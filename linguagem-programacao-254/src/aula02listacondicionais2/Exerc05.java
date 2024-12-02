package aula02listacondicionais2;

/*
* Escreva um programa em Java que solicite ao usuário um número e verifique se ele é negativo ou está no
* intervalo entre 5 e 15 (inclusive). Exiba “O número é negativo ou está entre 5 e 15” caso pelo menos uma das
* condições seja atendida, ou “O número não é negativo e não está entre 5 e 15” caso contrário.
* */

import utils.Util;

public class Exerc05 {
    public static void main(String[] args) {
        int num = Util.inputInt("Digite um número inteiro: ");

        if (num < 0 || (num >= 5 && num <= 15)) {
            System.out.println("O número é negativo ou está entre 5 e 15");
        } else {
            System.out.println("O número não é negativo e não está entre 5 e 15");
        }
    }
}
