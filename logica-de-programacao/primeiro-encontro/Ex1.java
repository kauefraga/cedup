/*
 * Kauê Fraga Rodrigues T. 254
 * Essa é solução do exercício 1 do encontro 2 (estrutura de repeticão e condição)
 */
import java.util.Scanner;

class Ex1 {
    public static void main(String[] args) {
        int idade = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        idade = scanner.nextInt();

        if (idade >= 0 && idade <= 11) {
            System.out.println("Você é uma criança!");
        } else if (idade >= 12 && idade <= 17) {
            System.out.println("Você é um adolescente!");
        } else if (idade >= 18 && idade <= 64) {
            System.out.println("Você é um adulto!");
        } else {
            System.out.println("Você é um idoso!");
        }

        // Zueira, não é necessário/não faz parte do exercício
        if (idade > 130) {
            System.out.println("Você já deve estar morto...");
        }

        scanner.close();
    }
}
