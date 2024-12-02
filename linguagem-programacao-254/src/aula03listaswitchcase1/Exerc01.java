package aula03listaswitchcase1;

/*
* Escreva um programa em Java que solicite ao usuário um número de 1 a 7 e, com base nesse número, exiba o dia da
* semana correspondente. Por exemplo, se o número for 1, o programa deve exibir “Domingo”, se for 2,
* “Segunda-feira”, e assim por diante. Caso o número esteja fora do intervalo de 1 a 7, exiba a mensagem
* “Número inválido”.
* */

import utils.Util;

public class Exerc01 {
    public static void main(String[] args) {
        int num = Util.inputInt("Digite um número de 1 a 7: ");

        switch (num) {
            case 1:
                Util.print("Segunda-feira");
                break;
            case 2:
                Util.print("Terça-feira");
                break;
            case 3:
                Util.print("Quarta-feira");
                break;
            case 4:
                Util.print("Quinta-feira");
                break;
            case 5:
                Util.print("Sexta-feira");
                break;
            case 6:
                Util.print("Sábado");
                break;
            case 7:
                Util.print("Domingo");
                break;
            default:
                Util.print("Fora do intervalo de dias da semana");
                break;
        }
    }
}
