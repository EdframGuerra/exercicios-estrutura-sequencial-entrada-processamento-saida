import java.util.Locale;
import java.util.Scanner;

public class ExecEstruturaSequencial05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        int cod1, qtd1, cod2, qtd2;
        double preco1, preco2, total;

        cod1 = leitor.nextInt();
        qtd1 = leitor.nextInt();
        preco1 = leitor.nextDouble();

        cod2 = leitor.nextInt();
        qtd2 = leitor.nextInt();
        preco2 = leitor.nextDouble();

        total = preco1 * qtd1 + preco2 * qtd2;

        System.out.printf("VALOR A PAGARr$: %.2f%n", total);

        leitor.close();
    }
}
