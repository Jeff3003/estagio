import java.util.Scanner;

public class InverterStrings {
    public static void main(String[] args) {
        Scanner caracter = new Scanner(System.in);

        // Solicita a palavra
        System.out.print("Digite uma string: ");
        String entrada = caracter.nextLine();

        char[] texto = entrada.toCharArray();
        int inicio = 0;
        int fim = entrada.length() - 1;

        // Troca os caracteres da extremidade até o meio
        while (inicio < fim) {
            char temporario = texto[inicio];
            texto[inicio] = texto[fim];
            texto[fim] = temporario;

            inicio++;
            fim--;
        }

        // Exibe o resultado invertido
        System.out.println("String invertida: " + new String(texto));
    }
}
