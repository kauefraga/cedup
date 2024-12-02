package aula01listadeoperadores2;

/*
* Crie um programa que declare duas variáveis para armazenar números reais, solicite que o usuário
* insira os valores e, por fim, verifique e exiba se o primeiro número é maior que o segundo.”
* */

import utils.Util;

public class Exerc02 {
    public static void main(String[] args) {
        float n1 = Util.inputFloat("Informe um valor: ");
        float n2 = Util.inputFloat("Informe outro valor: ");

        boolean eMaior = n1 > n2;

        System.out.println("O número 1 é maior que o número 2: " + eMaior);
    }
}
