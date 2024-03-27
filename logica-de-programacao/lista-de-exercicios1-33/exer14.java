import java.util.Scanner;

class exer14 {
    public static void main(String[] args) {
        int a, b;
        Scanner s = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        a = s.nextInt();

        System.out.print("Digite outro número inteiro: ");
        b = s.nextInt();

        if (a > b) {
            System.out.println("> O número " + a + " é maior do que o número " + b);
        } else {
            System.out.println("> O número " + b + " é maior do que o número " + a);
        }
    }
}
