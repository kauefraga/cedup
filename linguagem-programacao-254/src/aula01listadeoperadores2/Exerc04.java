package aula01listadeoperadores2;

/*
* Crie um programa que declare variáveis para armazenar as idades de duas pessoas. Solicite ao usuário que
* insira a idade da primeira e da segunda pessoa. Em seguida, compare as idades e exiba uma
* mensagem informando se a primeira pessoa é mais velha que a segunda.
*/

import utils.Util;

public class Exerc04 {
    public static void main(String[] args) {
        int idade1 = Util.inputInt("Informe a idade de uma pessoa: ");
        int idade2 = Util.inputInt("Informe a idade de outra pessoa: ");

        boolean maisVelha = idade1 > idade2;

        System.out.println("A primeira pessoa é mais velha: " + maisVelha);
    }
}
