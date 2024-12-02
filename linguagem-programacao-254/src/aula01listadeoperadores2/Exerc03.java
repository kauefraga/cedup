package aula01listadeoperadores2;

/*
* Desenvolva um programa que declare duas variáveis para armazenar strings e solicite ao usuário que insira um
* texto para cada uma delas. Em seguida, compare os valores das duas strings e exiba uma mensagem indicando
* se elas são diferentes.
* */

import utils.Util;

public class Exerc03 {
    public static void main(String[] args) {
        String s1 = Util.inputString("Digite um texto: ");
        String s2 = Util.inputString("Digite outro texto: ");

        boolean diferentes = !s1.equals(s2);

        System.out.println("O texto 1 é diferente ao texto 2: " + diferentes);
    }
}
