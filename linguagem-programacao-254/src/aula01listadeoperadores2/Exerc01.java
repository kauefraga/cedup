package aula01listadeoperadores2;

/*
* Escreva um programa em Java que declare duas variáveis inteiras. Solicite ao usuário que insira dois valores,
* armazene-os nas variáveis e, em seguida, verifique se são iguais. Exiba “Os números são iguais” ou
* “Os números são diferentes”, conforme o caso.
* */

import utils.Util;

public class Exerc01 {
    public static void main(String[] args) {
        int n1 = Util.inputInt("Informe um número inteiro: ");
        int n2 = Util.inputInt("Informe mais um número inteiro: ");

        boolean saoIguais = n1 == n2;

        System.out.println("Os números são iguais? " + saoIguais);
    }
}
