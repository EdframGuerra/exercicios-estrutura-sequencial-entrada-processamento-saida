import java.util.Scanner;

public class ExecEstruturaSequencial03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();
        int d = leitor.nextInt();

        int diferenca = (a * b - c * d);

        System.out.println("DIFERENÇA =" + diferenca);

        leitor.close();

    }
}
