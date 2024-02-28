// import java.util.Locale;
// import java.util.Scanner;

// public class ExecEstruturaSequencial04 {

// 	public static void main(String[] args) {

// 		Locale.setDefault(Locale.US);
// 		Scanner sc = new Scanner(System.in);

// 		int numero, horas;
// 	    double valorHora, salario;

// 	    numero = sc.nextInt();
// 	    horas = sc.nextInt();
// 	    valorHora = sc.nextDouble();

// 	    salario = valorHora * horas;

// 	    System.out.println("NUMBER = " + numero);
// 	    System.out.printf("SALARY = U$ %.2f%n", salario);

// 		sc.close();
// 	}
// }

import java.util.Locale;
import java.util.Scanner;

public class ExecEstruturaSequencial04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        int matricula, horasTrabalhadas;
        double valorHoraTrabalhada, salario;

        matricula = leitor.nextInt();
        horasTrabalhadas = leitor.nextInt();
        valorHoraTrabalhada = leitor.nextDouble();

        salario = valorHoraTrabalhada * horasTrabalhadas;

        System.out.println("FUNCIONARIO MATRICULA NUMERO " + matricula);
        System.out.printf("Salário R$ %.2f%n", salario);

        leitor.close();
    }
}
