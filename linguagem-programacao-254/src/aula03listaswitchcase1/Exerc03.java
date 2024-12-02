package aula03listaswitchcase1;

/*
* Escreva um programa em Java que solicite ao usuário um número de 1 a 12 e, com base nesse número, exiba o nome do
* mês correspondente. Por exemplo, se o número for 1, o programa deve exibir “Janeiro”, se for 2, “Fevereiro”, e
* assim por diante. Caso o número esteja fora do intervalo de 1 a 12, exiba a mensagem “Número inválido”.
* */

import utils.Util;

public class Exerc03 {
    public static void main(String[] args) {
        int num = Util.inputInt("Digite um número de 1 a 12: ");

        switch (num) {
            case 1:
                Util.print("Janeiro");
                break;
            case 2:
                Util.print("Fevereiro");
                break;
            case 3:
                Util.print("Março");
                break;
            case 4:
                Util.print("Abril");
                break;
            case 5:
                Util.print("Maio");
                break;
            case 6:
                Util.print("Junho");
                break;
            case 7:
                Util.print("Julho");
                break;
            case 8:
                Util.print("Agosto");
                break;
            case 9:
                Util.print("Setembro");
                break;
            case 10:
                Util.print("Outubro");
                break;
            case 11:
                Util.print("Novembro");
                break;
            case 12:
                Util.print("Dezembro");
                break;
            default:
                Util.print("Fora do intervalo dos meses");
                break;
        }
    }
}
