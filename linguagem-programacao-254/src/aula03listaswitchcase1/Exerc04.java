package aula03listaswitchcase1;

/*
* Escreva um programa em Java que solicite ao usuário três notas (de 0 a 10). O programa deve garantir que as
* notas inseridas sejam válidas, ou seja, não podem ser menores que “0” (zero) nem maiores que 10 (dez). Após a
* validação, calcule a média das notas e, com base na média, determine a situação do aluno:
* - Se a média for de 7 a 10, exiba “Aprovado”.
* - Se a média for de 4 a 6, exiba “Em recuperação”.
* - Se a média for de 0 a 3, exiba “Reprovado”.
* Caso alguma das notas seja inválida (menor que 0 ou maior que 10), o programa deve exibir “Nota inválida”.
* */

import utils.Util;

public class Exerc04 {
    public static void main(String[] args) {
        int nota1 = Util.inputInt("Digite sua primeira nota (0 a 10): ");
        int nota2 = Util.inputInt("Digite sua segunda nota (0 a 10): ");
        int nota3 = Util.inputInt("Digite sua terceira nota (0 a 10): ");

        if ((nota1 < 0 || nota1 > 10) && (nota2 < 0 || nota2 > 10) && (nota3 < 0 || nota3 > 10)) {
            Util.print("Notas fora do intervalo permitido (0 a 10)");
            System.exit(0);
        }

        int media = (nota1 + nota2 + nota3) / 3;

        switch (media) {
            case 0:
            case 1:
            case 2:
            case 3:
                Util.print("Reprovado");
                break;
            case 4:
            case 5:
            case 6:
                Util.print("Em recuperação");
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                Util.print("Aprovado");
                break;
            default:
                Util.print("Nota inválida (COMOOOOO?!)");
                break;
        }
    }
}
