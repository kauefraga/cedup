/*
 * Kauê Fraga Rodrigues T. 254
 * Essa é solução do exercício 4 do encontro 2 (estrutura de repeticão e condição)
 */
import java.util.Scanner;

class Ex4 {
    public static void main(String[] args) {
        String nome;
        int somaDasIdades = 0;
        int contadorDeIdades = 0; // quantidade de termos da média
        float mediaDasIdades;
        Scanner scanner = new Scanner(System.in);

        // esse 50 é exigência do exercício e determina a quantidade de iterações
        for (int i = 0; i < 50; i++) {
            System.out.print("Digite seu nome: ");
            nome = scanner.nextLine();

            System.out.print("Digite sua idade: ");
            String idade;
            idade = scanner.nextLine();
            somaDasIdades += Integer.parseInt(idade);
            contadorDeIdades += 1;

            System.out.println("Obrigado pela resposta, " + nome);
            System.out.println("----------------------------");
        }

        mediaDasIdades = somaDasIdades / contadorDeIdades;

        System.out.println("A média das idades é " + mediaDasIdades);

        scanner.close();
    }
}
