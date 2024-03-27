/*
 * Kauê Fraga Rodrigues T. 254
 * Essa é solução do exercício 2 do encontro 2 (estrutura de repeticão e condição)
 */
import java.util.Scanner;

class Ex2 {
    public static void main(String[] args) {
        int notaDaPesquisa;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua nota da pesquisa: ");
        notaDaPesquisa = scanner.nextInt();

        if (notaDaPesquisa >= 0 && notaDaPesquisa < 3) {
            System.out.println("Nota péssima!");
        } else if (notaDaPesquisa >= 3 && notaDaPesquisa < 5) {
            System.out.println("Nota ruim!");
        } else if (notaDaPesquisa >= 5 && notaDaPesquisa < 7) {
            System.out.println("Nota boa!");
        } else {
            System.out.println("Nota ótima!");
        }

        // Zueira, não é necessário/não faz parte do exercício
        if (notaDaPesquisa > 10) {
            System.out.println("Acho que essa nota não é possível...");
        }

        scanner.close();
    }
}
