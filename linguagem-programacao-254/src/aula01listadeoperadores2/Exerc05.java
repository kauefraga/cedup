package aula01listadeoperadores2;

/*
Escreva um programa que declare variáveis para armazenar os preços de dois produtos. Solicite ao usuário que
informe o preço do primeiro e do segundo produto. Em seguida, compare os preços e exiba
uma mensagem indicando se o preço do primeiro produto é menor ou igual ao do segundo.
*/

import java.util.Scanner;

public class Exerc05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Informe o preço de um produto: ");
        float preco1 = s.nextFloat();

        System.out.print("Digite o preço de outro produto: ");
        float preco2 = s.nextFloat();

        boolean primeiroMenor = preco1 < preco2;

        System.out.println("O primeiro produto é mais barato: " + primeiroMenor);
    }
}
