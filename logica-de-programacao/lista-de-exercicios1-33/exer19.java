import java.util.Scanner;

class exer19 {
    public static void main(String[] args) {
        int totalHomens, totalMulheres;
        Scanner s = new Scanner(System.in);

        int contador = 0;
        while (contador <= 5) {
            contador += 1;

            String nome;
            char sexo;

            System.out.print("Informe seu nome: ");
            nome = s.nextLine();

            System.out.print("Informe seu sexo (m ou f): ");
            sexo = s.nextLine().charAt(0); // primeiro caractere da string especificada

            if (sexo == 'm') {
                System.out.println("> " + nome + " é homem");
            } else if (sexo == 'f') {
                System.out.println("> " + nome + " é mulher");
            } else {
                System.out.println(">:)");
            }

            System.out.println("------------------");
        }
    }
}
