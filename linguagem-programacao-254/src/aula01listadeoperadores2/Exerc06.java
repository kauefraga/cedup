package aula01listadeoperadores2;

/*
Desenvolva um programa que declare variáveis para armazenar dois caracteres. Peça ao usuário que insira
os dois caracteres e, em seguida, compare-os. O programa deve exibir uma mensagem indicando se os
caracteres são iguais ou diferentes.
*/

import java.util.Scanner;

public class Exerc06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Informe a idade de uma pessoa: ");
        char caracter1 = s.nextLine().charAt(0);

        System.out.print("Informe a idade de outra pessoa: ");
        char caracter2 = s.nextLine().charAt(0);

        boolean iguais = caracter1 == caracter2;
        boolean diferentes = caracter1 != caracter2;

        System.out.println("O primeiro caracter é igual ao segundo: " + iguais);
        System.out.println("O primeiro caracter é diferente do segundo: " + diferentes);
    }
}
