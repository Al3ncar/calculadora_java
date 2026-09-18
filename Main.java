import java.util.Scanner;

public class Main {
    public static double media(double x, double y) { return (x + y) / 2; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x, y;

        System.out.print("Digite a 1° nota");
        x = sc.nextDouble();
        sc.nextLine();

        System.out.print("Digite a 2° nota");
        y = sc.nextDouble();
        sc.nextLine();

        System.out.print("Resultado: " + media(x, y));
        sc.close();
    }
}