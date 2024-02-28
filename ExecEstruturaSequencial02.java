import java.util.Locale;
import java.util.Scanner;

public class ExecEstruturaSequencial02 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        double pi = 3.14159;
        double raio = leitor.nextDouble();
        double area = raio * raio * pi;

        System.out.printf("Area = %.4f%n", area);

        leitor.close();
    }
}
