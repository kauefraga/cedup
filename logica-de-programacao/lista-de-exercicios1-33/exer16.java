import java.util.Scanner;

class exer16 {
    public static void main(String[] args) {
        String nome;
        float nota1, nota2, nota3;
        float media;
        Scanner s = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        nome = s.nextLine();

        System.out.print("Digite sua primeira nota: ");
        nota1 = s.nextFloat();

        System.out.print("Digite sua segunda nota: ");
        nota2 = s.nextFloat();

        System.out.print("Digite sua terceira nota: ");
        nota3 = s.nextFloat();

        media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.println(nome + " está aprovado(a) com média " + media + "!");
        } else if (media >= 5.1 && media <= 6.9) {
            System.out.println(nome + " está de recuperação com média " + media + ".");
        } else if (media >= 0 && media <= 5) {
            System.out.println(nome + " está reprovado(a) com média " + media + ".");
        } else {
            System.out.println("IMPOSSÍVEL!?");
        }
    }
}
