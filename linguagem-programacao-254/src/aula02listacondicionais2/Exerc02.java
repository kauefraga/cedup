package aula02listacondicionais2;

/*
 * Escreva um programa em Java que solicite ao usuário um número e verifique se ele é par ou múltiplo de 3.
 * Exiba “O número é par ou múltiplo de 3” caso pelo menos uma das condições seja atendida, ou
 * “O número não é par nem múltiplo de 3” caso contrário.
 * */

import utils.Util;

public class Exerc02 {
    public static void main(String[] args) {
        int num = Util.inputInt("Digite um número inteiro: ");

        if (num % 2 == 0 || num % 3 == 0) {
            System.out.println("O número é par ou múltiplo de 3");
        } else {
            System.out.println("O número não é par nem múltiplo de 3");
        }
    }
}
