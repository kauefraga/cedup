package aula02listacondicionais2;

/*
* Escreva um programa em Java que solicite a idade de uma pessoa e verifique se ela tem idade para
* votar (16 anos ou mais). Caso a pessoa tenha 16 anos ou mais, pergunte “Possui título de eleitor? (S/N)”.
* Utilize possuiTitulo.equalsIgnoreCase("S") para verificar a resposta. Exiba “A pessoa tem idade para
* votar e possui título de eleitor” caso ambas as condições sejam atendidas, ou “A pessoa não tem
* idade para votar ou não possui título de eleitor” caso contrário.
* */

import utils.Util;

public class Exerc04 {
    public static void main(String[] args) {
        int idade = Util.inputInt("Informe sua idade: ");

        if (idade >= 16) {
            boolean possuiTitulo = Util.inputSimNao("Possui título de eleitor?");

            if (possuiTitulo) {
                System.out.println("A pessoa tem idade para votar e possui título de eleitor");
            }
        } else {
            System.out.println("A pessoa não tem idade para votar ou não possui título de eleitor");
        }
    }
}
