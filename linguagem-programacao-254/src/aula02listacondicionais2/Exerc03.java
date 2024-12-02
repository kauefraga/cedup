package aula02listacondicionais2;

/*
* Escreva um programa em Java que solicite ao usuário um número e verifique se ele é maior que 10 e
* menor que 100. Exiba “O número é maior que 10 e menor que 100” caso ambas as condições sejam
* atendidas, ou “O número não está no intervalo entre 10 e 100” caso contrário.
* */

import utils.Util;

public class Exerc03 {
    public static void main(String[] args) {
        int num = Util.inputInt("Digite um número inteiro: ");

        if (num > 10 && num < 100) {
            System.out.println("O número é maior que 10 e menor que 100");
        } else {
            System.out.println("O número não está no intervalo entre 10 e 100");
        }
    }
}
