package aula01listadeoperadores2;

/*
Desenvolva um programa que declare variáveis para armazenar as alturas de duas pessoas. Solicite ao usuário que
insira as alturas e, em seguida, compare-as. O programa deve exibir uma mensagem indicando se a altura da primeira
pessoa é maior ou igual à altura da segunda.
*/

import java.util.Scanner;

public class Exerc07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite a altura de uma pessoa (cm): ");
        int altura1 = s.nextInt();

        System.out.print("Informe a idade de outra pessoa: ");
        int altura2 = s.nextInt();

        boolean maiorOuIgual = altura1 >= altura2;

        System.out.println("A altura da primeira pessoa é maior ou igual a da segunda: " + maiorOuIgual);
    }
}
