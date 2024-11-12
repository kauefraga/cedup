package aula01listadeoperadores2;

/*
* Desenvolva um programa que declare duas variáveis para armazenar strings e solicite ao usuário que insira um
* texto para cada uma delas. Em seguida, compare os valores das duas strings e exiba uma mensagem indicando
* se elas são diferentes.
* */

import java.util.Scanner;

public class Exerc03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite um texto: ");
        String s1 = s.nextLine();

        System.out.print("Digite outro texto: ");
        String s2 = s.nextLine();

        boolean diferentes = !s1.equals(s2);

        System.out.println("O texto 1 é diferente ao texto 2: " + diferentes);
    }
}
