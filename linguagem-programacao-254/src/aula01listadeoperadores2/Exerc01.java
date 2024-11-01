package aula01listadeoperadores2;

import java.util.Scanner;

public class Exerc01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        int n1 = s.nextInt();

        System.out.println("Informe mais um número inteiro: ");
        int n2 = s.nextInt();

        boolean saoIguais = n1 == n2;

        System.out.println("Os números são iguais? " + saoIguais);
    }
}
