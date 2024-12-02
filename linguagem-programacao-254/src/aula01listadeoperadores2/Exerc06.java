package aula01listadeoperadores2;

/*
* Desenvolva um programa que declare variáveis para armazenar dois caracteres. Peça ao usuário que insira
* os dois caracteres e, em seguida, compare-os. O programa deve exibir uma mensagem indicando se os
* caracteres são iguais ou diferentes.
*/

import utils.Util;

public class Exerc06 {
    public static void main(String[] args) {
        char caracter1 = Util.inputChar("Digite um caracter: ");
        char caracter2 = Util.inputChar("Digite outro caracter: ");

        boolean iguais = caracter1 == caracter2;
        boolean diferentes = caracter1 != caracter2;

        System.out.println("O primeiro caracter é igual ao segundo: " + iguais);
        System.out.println("O primeiro caracter é diferente do segundo: " + diferentes);
    }
}
