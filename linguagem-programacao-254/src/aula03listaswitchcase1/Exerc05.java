package aula03listaswitchcase1;

/*
* Escreva um programa em Java que solicite ao usuário um número de 1 a 4 e, com base nesse número, exiba o quadrante correspondente no plano cartesiano:
* - 1: Primeiro quadrante (x positivo, y positivo)
* - 2: Segundo quadrante (x negativo, y positivo)
* - 3: Terceiro quadrante (x negativo, y negativo)
* - 4: Quarto quadrante (x positivo, y negativo)
* Caso o número inserido esteja fora do intervalo de 1 a 4, exiba a mensagem “Número inválido”.
* */

import utils.Util;

public class Exerc05 {
    public static void main(String[] args) {
        int num = Util.inputInt("Digite um número de 1 a 4: ");

        switch (num) {
            case 1:
                Util.print("Primeiro quadrante (x positivo, y positivo)");
                break;
            case 2:
                Util.print("Segundo quadrante (x negativo, y positivo)");
                break;
            case 3:
                Util.print("Terceiro quadrante (x negativo, y negativo)");
                break;
            case 4:
                Util.print("Quarto quadrante (x positivo, y negativo)");
                break;
            default:
                Util.print("Número inválido");
                break;
        }
    }
}
