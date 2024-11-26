package utils;

import java.util.Scanner;

public class Util {
    public static int InputInt(String mensagem) {
        Scanner s = new Scanner(System.in);

        System.out.println(mensagem);
        return s.nextInt();
    }

    public static char inputChar(String mensagem) {
        Scanner s = new Scanner(System.in);

        System.out.println(mensagem);
        return s.next().charAt(0);
    }

    /**
     * Esse método retorna true se o usuário digitar apenas S e false caso não digite S
     */
    public static boolean InputSimNao(String mensagem) {
        Scanner s = new Scanner(System.in);

        System.out.println(mensagem + " (S/N) ");
        return s.next().equalsIgnoreCase("S");
    }

    public static void print(String mensagem) {
        System.out.println(":> " + mensagem);
    }
}