package aula01listadeoperadores2;

/*
* Desenvolva um programa que declare variáveis para armazenar os anos de nascimento de duas pessoas. Solicite ao
* usuário que insira os anos de nascimento e, em seguida, compare os valores. O programa deve exibir uma mensagem
* indicando se a primeira pessoa é mais nova do que a segunda.
* */

import java.util.Scanner;

public class Exerc09 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento de uma pessoa: ");
        int ano1 = s.nextInt();

        System.out.print("Digite o ano de nascimento de outra pessoa: ");
        int ano2 = s.nextInt();

        boolean primeiraMaisNova = ano1 < ano2;

        System.out.println("A primeira pessoa é mais nova do que a segunda: " + primeiraMaisNova);
    }
}
