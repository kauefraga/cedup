package aula03listaswitchcase1;

/*
* Escreva um programa em Java que solicite ao usuário uma letra e, utilizando a estrutura switch case,
* verifique se a letra é uma vogal (a, e, i, o, u) ou uma consoante. Exiba “A letra é uma vogal” se a letra for
* uma das vogais, ou “A letra é uma consoante” caso contrário. Certifique-se de que o programa considere tanto
* maiúsculas quanto minúsculas.
* */

import utils.Util;

public class Exerc02 {
    public static void main(String[] args) {
        char letra = Util.inputChar("Digite uma letra: ");

        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                Util.print("A letra é uma vogal");
                break;
            default:
                Util.print("A letra é uma consoante");
                break;
        }
    }
}
