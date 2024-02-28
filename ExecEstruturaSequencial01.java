import java.util.Scanner;

public class ExecEstruturaSequencial01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int soma;
        int num1 = leitor.nextInt();
        int num2 = leitor.nextInt();

        soma = num1 + num2;

        System.out.println("SOMA = " + soma);

        leitor.close();

    }
}