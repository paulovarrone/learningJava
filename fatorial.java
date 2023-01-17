import java.util.Locale;
import java.util.Scanner;

public class fatorial {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			int i, n, fatorial;

			System.out.print("Digite o valor de N: ");
			n = sc.nextInt();

			fatorial = 1;
			for (i=n; i>0; i--) {
			    fatorial = fatorial * i;
			}

			System.out.printf("FATORIAL = %d\n", fatorial);

			sc.close();
		}
	}
}