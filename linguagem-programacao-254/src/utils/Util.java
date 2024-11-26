package utils;

import java.util.Scanner;

public class Util {
    public static int InputInt(String mensagem) {
        Scanner s = new Scanner(System.in);

        System.out.println(mensagem);
        return s.nextInt();
    }

    /**
     * Esse método retorna true se o usuário digitar apenas S e false caso não digite S
     */
    public static boolean InputSimNao(String mensagem) {
        Scanner s = new Scanner(System.in);

        System.out.println(mensagem + " (S/N) ");
        return s.next().equalsIgnoreCase("S");
    }
}
