import java.util.Scanner;

class exer15 {
    public static void main(String[] args) {
        int numero;
        Scanner s = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        numero = s.nextInt();

        if (numero >= 100 && numero <= 200) {
            System.out.println("O número " + numero + " está entre 100 e 200!");
        } else {
            System.out.println("O número especificado não está entre 100 e 200.");
        }
    }
}
