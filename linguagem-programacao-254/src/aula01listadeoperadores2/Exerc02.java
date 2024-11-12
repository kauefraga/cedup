package aula01listadeoperadores2;

/*
* Crie um programa que declare duas variáveis para armazenar números reais, solicite que o usuário
* insira os valores e, por fim, verifique e exiba se o primeiro número é maior que o segundo.”
* */

import java.util.Scanner;

public class Exerc02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Informe um valor: ");
        float n1 = s.nextFloat();

        System.out.print("Informe outro valor: ");
        float n2 = s.nextFloat();

        boolean eMaior = n1 > n2;

        System.out.println("O número 1 é maior que o número 2: " + eMaior);
    }
}
