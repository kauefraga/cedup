package aula01listadeoperadores2;

/*
* Desenvolva um programa que declare variáveis para armazenar as alturas de duas pessoas. Solicite ao usuário que
* insira as alturas e, em seguida, compare-as. O programa deve exibir uma mensagem indicando se a altura da primeira
* pessoa é maior ou igual à altura da segunda.
*/

import utils.Util;

public class Exerc07 {
    public static void main(String[] args) {
        int altura1 = Util.inputInt("Digite a altura de uma pessoa (cm): ");
        int altura2 = Util.inputInt("Digite a altura de outra pessoa (cm): ");

        boolean maiorOuIgual = altura1 >= altura2;

        System.out.println("A altura da primeira pessoa é maior ou igual a da segunda: " + maiorOuIgual);
    }
}
