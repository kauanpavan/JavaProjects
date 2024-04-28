import java.util.Scanner;

public class Retangulo {
    private String cor;
    private double comprimento;
    private double largura;

    public Retangulo(String cor, double comprimento, double largura) {
        this.cor = cor;
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public double calcularArea() {
        return comprimento * largura;
    }

    public double calcularPerimetro() {
        return 2 * (comprimento + largura);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com os dados do Retângulo 1:");
        System.out.print("Cor: ");
        String cor1 = scanner.nextLine();
        System.out.print("Comprimento: ");
        double comprimento1 = scanner.nextDouble();
        System.out.print("Largura: ");
        double largura1 = scanner.nextDouble();
        Retangulo retangulo1 = new Retangulo(cor1, comprimento1, largura1);

        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.println("\nEntre com os dados do Retângulo 2:");
        System.out.print("Cor: ");
        String cor2 = scanner.nextLine();
        System.out.print("Comprimento: ");
        double comprimento2 = scanner.nextDouble();
        System.out.print("Largura: ");
        double largura2 = scanner.nextDouble();
        Retangulo retangulo2 = new Retangulo(cor2, comprimento2, largura2);

        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.println("\nEntre com os dados do Retângulo 3:");
        System.out.print("Cor: ");
        String cor3 = scanner.nextLine();
        System.out.print("Comprimento: ");
        double comprimento3 = scanner.nextDouble();
        System.out.print("Largura: ");
        double largura3 = scanner.nextDouble();
        Retangulo retangulo3 = new Retangulo(cor3, comprimento3, largura3);

        scanner.close();

        System.out.println("\nRetângulo 1:");
        System.out.println("Cor: " + retangulo1.cor);
        System.out.println("Área: " + retangulo1.calcularArea());
        System.out.println("Perímetro: " + retangulo1.calcularPerimetro());

        System.out.println("\nRetângulo 2:");
        System.out.println("Cor: " + retangulo2.cor);
        System.out.println("Área: " + retangulo2.calcularArea());
        System.out.println("Perímetro: " + retangulo2.calcularPerimetro());

        System.out.println("\nRetângulo 3:");
        System.out.println("Cor: " + retangulo3.cor);
        System.out.println("Área: " + retangulo3.calcularArea());
        System.out.println("Perímetro: " + retangulo3.calcularPerimetro());
    }
}