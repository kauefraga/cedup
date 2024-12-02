package utils;

import java.util.Scanner;

public class Util {
    public static String inputPalavraMinuscula(String mensagem) {
        Scanner s = new Scanner(System.in);

        System.out.println(mensagem);
        return s.next().toLowerCase();
    }

    public static int inputInt(String mensagem) {
        Scanner s = new Scanner(System.in);

        System.out.println(mensagem);
        return s.nextInt();
    }

    public static float inputFloat(String mensagem) {
        Scanner s = new Scanner(System.in);

        System.out.println(mensagem);
        return s.nextFloat();
    }

    public static String inputString(String mensagem) {
        Scanner s = new Scanner(System.in);

        System.out.println(mensagem);
        return s.nextLine();
    }

    public static char inputChar(String mensagem) {
        Scanner s = new Scanner(System.in);

        System.out.println(mensagem);
        return s.next().charAt(0);
    }

    /**
     * Esse método retorna true se o usuário digitar apenas S e false caso não digite S
     */
    public static boolean inputSimNao(String mensagem) {
        Scanner s = new Scanner(System.in);

        System.out.println(mensagem + " (S/N) ");
        return s.next().equalsIgnoreCase("S");
    }

    public static void print(String mensagem) {
        System.out.println(":> " + mensagem);
    }
}
