import java.util.Scanner;

class exer20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("--- CARANGO VELHO ---");
        System.out.println("Nossos veículos estão com desconto!\n");

        int totalVeiculos = 0, veiculosComAnoAteDoisMil = 0;

        // loop infinito
        while (true) {
            totalVeiculos += 1;

            float carroValor;
            int carroAno;
            float valorDesconto, valorTotal;

            System.out.print("Informe o valor do carro (R$): ");
            carroValor = s.nextFloat();

            System.out.print("Informe o ano do carro: ");
            carroAno = s.nextInt();

            if (carroAno <= 2000) {
                veiculosComAnoAteDoisMil += 1;
                valorDesconto = carroValor * 12 / 100;
                System.out.println("O desconto desse veículo é de R$" + valorDesconto);
                System.out.println("O valor total desse veículo é R$" + (carroValor - valorDesconto));
            } else if (carroAno > 2000) {
                valorDesconto = carroValor * 7 / 100;
                System.out.println("O desconto desse veículo é de R$" + valorDesconto);
                System.out.println("O valor total desse veículo é R$" + (carroValor - valorDesconto));
            } else {
                System.out.println("IMPOSSÍVEL!");
            }

            // Poderia ser um boolean (true/false -> sim/nao)
            String querContinuar;

            System.out.print("\nQuer continuar calculando o desconto dos veículos (s/n): ");
            s.nextLine();
            querContinuar = s.nextLine();

            if (querContinuar.equals("s")) {
                System.out.println("Continuando...");
            } else if (querContinuar.equals("n")) {
                System.out.println("----------------");
                break;
            } else {
                System.out.println("Opção inválida. Continuando...");
            }

            System.out.println("----------------");
        }


        System.out.println("Total de veículos (geral): " + totalVeiculos);
        System.out.println("Veículos com ano até 2000: " + veiculosComAnoAteDoisMil);
        System.out.println("Obrigado por comprar conosco!");
    }
}
