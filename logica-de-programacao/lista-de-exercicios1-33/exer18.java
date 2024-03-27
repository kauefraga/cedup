import java.util.Scanner;

class exer18 {
    public static void main(String[] args) {
        int contador = 0;
        Scanner s = new Scanner(System.in);

        while (contador <= 75) {
            contador += 1;
            int idade;

            System.out.print("Informe sua idade: ");
            idade = s.nextInt();

            if (idade >= 18) {
                System.out.println("> Maior de idade");
            } else {
                System.out.println("> Menor de idade");
            }

            System.out.println("---------------");
        }
    }
}
