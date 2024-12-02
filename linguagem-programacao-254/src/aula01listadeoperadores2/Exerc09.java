package aula01listadeoperadores2;

/*
* Desenvolva um programa que declare variáveis para armazenar os anos de nascimento de duas pessoas. Solicite ao
* usuário que insira os anos de nascimento e, em seguida, compare os valores. O programa deve exibir uma mensagem
* indicando se a primeira pessoa é mais nova do que a segunda.
* */

import utils.Util;

public class Exerc09 {
    public static void main(String[] args) {
        int ano1 = Util.inputInt("Digite o ano de nascimento de uma pessoa: ");
        int ano2 = Util.inputInt("Digite o ano de nascimento de outra pessoa: ");

        boolean primeiraMaisNova = ano1 > ano2; // ex.: 2010 > 1990

        System.out.println("A primeira pessoa é mais nova do que a segunda: " + primeiraMaisNova);
    }
}
