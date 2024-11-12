package aula01listadeoperadores2;

/*
Crie um programa que declare variáveis para armazenar as idades de duas pessoas. Solicite ao usuário que
insira a idade da primeira e da segunda pessoa. Em seguida, compare as idades e exiba uma
mensagem informando se a primeira pessoa é mais velha que a segunda.
*/

import java.util.Scanner;

public class Exerc04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Informe a idade de uma pessoa: ");
        int idade1 = s.nextInt();

        System.out.print("Informe a idade de outra pessoa: ");
        int idade2 = s.nextInt();

        boolean maisVelha = idade1 > idade2;

        System.out.println("A primeira pessoa é mais velha: " + maisVelha);
    }
}
